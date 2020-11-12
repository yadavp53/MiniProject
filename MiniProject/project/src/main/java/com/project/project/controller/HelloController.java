package com.project.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	TopicService topicService;
	@RequestMapping("/topic")
	public List<Topic> getRequest() {
		return topicService.getAllTopics();
	}	
	
	@PostMapping(value="/topic/post")	
		public void addTopic(@RequestBody Topic t) {
		topicService.addTopic(t);		
		}
	@PutMapping(value="/topic/update/{id}")
	public void updateTopic(@PathVariable String id,@RequestBody Topic t) {
		topicService.updateTopic(id,t);		
		}
	@DeleteMapping(value="/topic/delete/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}


}
