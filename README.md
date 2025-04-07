Windows: directly download from kafka website and follow the commands
Linux:
1. wget https://downloads.apache.org/kafka/3.8.1/kafka_2.13-3.8.1.tgz
2. tar -xzf kafka_2.13-3.8.1.tgz
3. cd kafka_2.13-3.8.1

  Commands
1. bin/zookeeper-server-start.sh config/zookeeper.properties (Start Zookeeper)
2. bin/kafka-server-start.sh config/server.properties (Start Kafka Broker)

