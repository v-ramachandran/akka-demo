package org.vramachandran.akkademo.helloworld.model;

import java.io.Serializable;

public class Message implements Serializable{
	
	private String content;
	
	public Message(final String content) {
		this.content = content;
	}
	
	/**
	 * @return the contained message.
	 */
	public String getMessage() {
		return content;
	}
	
	@Override
	public String toString() {
		return content;
	}
}
