package QUESTIONS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class AllOne {
    Node start;
    Node end;
    HashMap<String, Node> keyMapping;

    class Node {
        int freq;
        HashSet<String> items;

        public Node(int freq) {
            this.freq = freq;
            this.items = new HashSet<>();
        }

        Node next;
        Node prev;
    }

    public AllOne() {
        start = new Node(-1);
        end = new Node(-1);
        start.next = end;
        end.prev = start;
        keyMapping = new HashMap<>();
    }

    public void inc(String key) {
        if (keyMapping.containsKey(key)) {
            Node node = keyMapping.get(key);
            node.items.remove(key);
            if (node.next.freq == node.freq + 1) {
                node.next.items.add(key);
                keyMapping.put(key, node.next);
            } else {
                Node nNode = new Node(node.freq + 1);
                nNode.items.add(key);
                addNode(node, nNode);
                keyMapping.put(key, nNode);
            }
        } else {
            if (start.next.freq == 1) {
                start.next.items.add(key);
                keyMapping.put(key, start.next);
            } else {
                Node nNode = new Node(1);
                nNode.items.add(key);
                addNode(start, nNode);
                keyMapping.put(key, nNode);
            }
        }
    }

    public void dec(String key) {
        if (keyMapping.containsKey(key)) {
            Node node = keyMapping.get(key);
            node.items.remove(key);
            if (node.prev.freq == node.freq - 1) {
                node.prev.items.add(key);
                keyMapping.put(key, node.prev);
            } else {
                Node nNode = new Node(node.freq - 1);
                nNode.items.add(key);
                addNode(node.prev, nNode);
                keyMapping.put(key, nNode);
            }
        }
    }

    public String getMaxKey() {
        return end.prev != start? new ArrayList<>(end.prev.items).get(0):"";
    }

    public String getMinKey() {
        return start.next != end? new ArrayList<>(start.next.items).get(0):"";
    }

    public void addNode(Node current, Node newNode) {
        Node temp = current.next;
        current.next = newNode;
        newNode.prev = current;
        newNode.next = temp;
        temp.prev = newNode;
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */