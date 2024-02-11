#!/bin/bash


echo "Applying postgres_orderservice.deployment.yml"
kubectl apply -f postgres_orderservice.deployment.yml

echo "Applying postgres_productservice.deployment.yml"
kubectl apply -f postgres_productservice.deployment.yml

echo "Applying postgres_productservice.deployment.yml"
kubectl apply -f postgres_ordervalidationservice.deployment.yml

echo "Applying persistentvolume_kafka_data.deployment.yml"
kubectl apply -f persistentvolume_kafka_data.deployment.yml

echo "Applying consul.deployment.yml"
kubectl apply -f consul.deployment.yml


echo "Applying kafka.deployment.yml"
kubectl apply -f kafka.deployment.yml

echo "Applying order_service.deployment.yml"
kubectl apply -f order_service.deployment.yml

echo "Applying product_service.deployment.yml"
kubectl apply -f product_service.deployment.yml

echo "Applying order_validation_service.deployment.yml"
kubectl apply -f order_validation_service.deployment.yml

echo "Applying api_gateway.deployment.yml"
kubectl apply -f api_gateway.deployment.yml


echo "All deployments have been applied."