package com.tutorialspoint.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler implements ApplicationListener<ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent e) {
		System.out.println("ContextStartedEvent Received!");
	}

}
