package com.project.project.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	List<Topic> topics=new ArrayList<>(Arrays.asList(new Topic("java","Spring Framework","Spring Framework Description"),
			new Topic("java","S Framework","S Framework Description"),
			new Topic("java","Framework"," Framework Description"),
			new Topic("python","python Framework","python Framework Description")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}	
	
	public void addTopic(Topic t) {
		topics.add(t);
	}
	
	public void updateTopic(String id,Topic t) {
		for(int i=0;i<topics.size();i++)
			{
			Topic t1=topics.get(i);
			if(t1.getId().equals(id)) {
				topics.set(i,t);
			}
			}	
		}

	public void deleteTopic(String id) {
		for(int i=0;i<topics.size();i++)
		{
		Topic t1=topics.get(i);
		if(t1.getId().equals(id)) {
			topics.remove(i);
		}
		}// TODO Auto-generated method stub
		
	}
	}
	
