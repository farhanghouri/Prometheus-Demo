# Prometheus-Demo

API:
http://localhost:8080/createCluster

Metrics.counter("cluster.create").increment();



# How to run Prometheus Server
sudo docker run  -p 9090:9090 -v /home/farhan/Downloads/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml




[Prometheus yaml file](prometheus.yml)


Metrics: http://localhost:8080/actuator/prometheus
