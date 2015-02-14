package org.vramachandran.akkademo.helloworld.main;

import org.vramachandran.akkademo.helloworld.actor.HelloWorldActor;
import org.vramachandran.akkademo.helloworld.model.Message;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class Main {
	
	public static String MAIN_ACTOR_SYSTEM_NAME = "hello-world";
	
	public static void main(String[] args) {
		
		final ActorSystem actorSystem = ActorSystem.create(MAIN_ACTOR_SYSTEM_NAME);
		final ActorRef helloWorldActor = 
			actorSystem.actorOf(Props.create(HelloWorldActor.class));
		final Message message = new Message("Print Me to the Command Line!");
		
		helloWorldActor.tell(message, null);
		
		// Try an unhandled message
		helloWorldActor.tell("This should be unhandled", null);
		
		actorSystem.shutdown();
	}
}
