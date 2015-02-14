package org.vramachandran.akkademo.helloworld.actor;

import org.vramachandran.akkademo.helloworld.model.Message;

import akka.actor.UntypedActor;

public class HelloWorldActor extends UntypedActor {
	
	
	private void handleMessage(final Message message) throws Exception {
		final String outputMessage = 
			String.format("Hello world! Look what I got: %s!", message);
		System.out.println(outputMessage);
	}
	/** 
	 * (non-Javadoc)
	 * @see akka.actor.UntypedActor#onReceive(java.lang.Object)
	 */
	@Override
	public void onReceive(Object message) throws Exception {
		
		if (message instanceof Message) {
			handleMessage((Message) message);
		} else {
			unhandled(message);
		}
	}
}
