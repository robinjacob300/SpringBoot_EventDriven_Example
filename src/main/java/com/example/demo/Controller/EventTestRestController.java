package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.event.publishingSectors.PublishCodeForEvent;

@RestController
public class EventTestRestController {

	@Autowired
	PublishCodeForEvent es;
	
	@GetMapping("/home")
	public String testthesomeThingEvent()
	{
		es.goAndPublishEvent("Hey Buddy we are sending the package");
		return "we think we got everything right";
	}
}
