Design and implement an in-memory, multi-threaded queue system similar to Amazon Simple Queue Service (SQS) that allows for asynchronous message processing. The system should provide a reliable way to transfer messages between different parts of an application, ensuring that each message is processed by a consumer. The queue should support multiple producers and consumers operating concurrently.

Example: AdditionWorker - 5 seconds

Message: 2 numbers.

Difference between SQS and Kafka
- SQS have no concept of topic. there is by default only one topic. Every consumer polls for message and it is sent to one of the consumers.
- Kafka have multiple topics. each message is processed by every topic once. we can call it consumer group.