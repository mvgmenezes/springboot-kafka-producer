# Kafka Producer

### Reference Documentation
https://www.youtube.com/watch?v=NjHYWEV_E_o&t=623s

* [Documentation ](https://kafka.apache.org/quickstart)


### 1 - Primeiro instalar o kafka e o zookeeper
Quando se faz o download do kafka ele ja vem com o zookeeper juntos, portanto nao precisa fazer o download do zookeeper

* [Baixar o Kafka](https://www.apache.org/dyn/closer.cgi?path=/kafka/2.2.0/kafka_2.12-2.2.0.tgz)

### 2 - Executar o Zookeeper
1. Entrar na pasta do kafka_2.12-2.2.0 e executar o comando:
2. `$ bin/zookeeper-server-start.sh config/zookeeper.properties`

### 3 - Executar o Kafka
1. Entrar na pasta do kafka_2.12-2.2.0 e executar o comando:
2. `$ bin/kafka-server-start.sh config/server.properties`

### 4 - Criar um Topic para o Kafka
1. Entrar na pasta do kafka_2.12-2.2.0 e executar o comando:
2. `$ bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example`

### 5 - Criar um consumer no localhost:9092
1. Entrar na pasta do kafka_2.12-2.2.0 e executar o comando:
2. `$ bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic Kafka_Example --from-beginning`


