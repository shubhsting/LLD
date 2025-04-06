package QUESTIONS.HIT_COUNTER;

import java.util.ArrayList;
import java.util.List;

class HitCounter {
    List<Integer> queue; 
    public HitCounter() {
        queue = new ArrayList<>();
    }
    
    public void hit(int timestamp) {
        queue.add(timestamp);
    }
    
    public int getHits(int timestamp) {
        int start = 0;
        int end = queue.size() - 1;
        while(start<end) {
            int mid = start + (end - start)/2;
            if(queue.get(mid) < timestamp-300) start = mid+1;
            else end = mid;
        }
        return queue.size() - start;
    }
}

