package com.mmenezes.kafka.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmenezes.kafka.model.User;

@RestController
@RequestMapping("kafka")
public class UserResources {

	private static final String TOPIC = "Kafka_Example";
	@Autowired
	KafkaTemplate<String, User> kafkaTemplate;
	
	
	@GetMapping("/publish/{name}")
	public String post(@PathVariable("name") final String name) {
		
		kafkaTemplate.send(TOPIC, new User(name, "Technology",12000L));
		return "Publised successfuly";
	}
}
