package com.example.demo.event.publishingSectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.example.demo.event.GenericBook;
import com.example.demo.event.Please;
import com.example.demo.event.SomeEventDefinitios;

@Service
public class PublishCodeForEvent {

	@Autowired
	ApplicationEventPublisher publisher;
	
	
	public void goAndPublishEvent(String data)
	{
		publisher.publishEvent( new SomeEventDefinitios(this,data));
		publisher.publishEvent( new Please<String, GenericBook<String>>(
				this, new GenericBook<String>("Data to the generic orgs")));
		
		
		publisher.publishEvent( new Please<Integer, GenericBook<Integer>>(
				this, new GenericBook<Integer>(1234123)));
	}
}
