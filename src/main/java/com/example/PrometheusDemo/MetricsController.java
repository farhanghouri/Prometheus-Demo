package com.example.PrometheusDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Metrics;

@RestController
public class MetricsController {
	
	@GetMapping("/createCluster")
	public String incrementClusterCreateMetrics() {
		Metrics.counter("cluster.create").increment();
		return "cluster created";
	}
}
