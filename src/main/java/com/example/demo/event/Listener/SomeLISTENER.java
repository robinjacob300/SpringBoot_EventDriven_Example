package com.example.demo.event.Listener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.example.demo.event.GenericBook;
import com.example.demo.event.Please;
import com.example.demo.event.SomeEventDefinitios;

@Component
public class SomeLISTENER {

	@EventListener
	public void listenToThisEventBuddy(SomeEventDefinitios event) throws InterruptedException
	{
		System.out.println("catched the event");
		System.out.println("processing initiated");
		Thread.sleep(20000);
		System.out.println("Processing...");
		System.out.println("Now exitig");
	}
	
	@EventListener
	@Async
	public void listenToThisEventBuddyWithAAsync(SomeEventDefinitios event) throws InterruptedException
	{
		System.out.println("catched the event ASYNC");
		System.out.println("processing initiated ASYNC");
		Thread.sleep(20000);
		System.out.println("Processing... ASYNC");
		System.out.println("Now exitig ASYNC");
	}
	
	
	@EventListener
	@Async
	public <S> void PleaselistenToThisEventBuddyWithAAsync(Please<S,GenericBook<S>> event) throws InterruptedException
	{
		System.out.println("We are iside the Genric method dear");
		System.out.println("processing initiated Generic");
		Thread.sleep(20000);
		System.out.println("Processing... Our brand new Generic Methods");
		System.out.println("Now exitig ASYNCly Generically");
	}
}
