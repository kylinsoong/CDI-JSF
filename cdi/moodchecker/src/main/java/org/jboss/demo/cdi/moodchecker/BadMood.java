package org.jboss.demo.cdi.moodchecker;

public class BadMood implements MoodChecker {

	public String checkMood() {
		return "I feel terrible !";
	}

}
