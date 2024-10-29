package MULTITHREADING.MESSAGE_BROKER;

import java.util.HashMap;

public class MessageBroker {
    HashMap<String, Topic> topics;
    public MessageBroker() {
        topics = new HashMap<>();
    }
    public Topic createTopic(final String topicName) {
        if (topics.containsKey(topicName)) throw new RuntimeException("Topic Already exists");
        Topic topic = new Topic(topicName);
        topics.put(topicName, topic);
        return topic;
    }

    public void publish(CalculationMessage message) {
        for (Topic topic : topics.values()) topic.publish(message);
    }

    public void publish(Topic topic, CalculationMessage message) {
        topic.publish(message);
    }

}
