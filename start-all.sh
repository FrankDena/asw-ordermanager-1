#!/bin/bash
###################################################CONSUL
echo Starting Consul in a Docker Container

docker run -d --hostname localhost --name asw-consul --publish 8500:8500 docker.io/hashicorp/consul
###################################################POSTGRES
echo Starting Postgres...

docker compose up -d
###################################################TOPICS
echo Creating Kafka topics for the order service...

KAFKA_DOCKER=$(docker ps | grep kafka | grep -v zookeeper | awk '{print $1}')

docker exec -it $KAFKA_DOCKER kafka-topics.sh --bootstrap-server localhost:9092 --create --topic order-service-event-channel --replication-factor 1 --partitions 4

