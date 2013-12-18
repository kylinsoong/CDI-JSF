package org.jboss.demo.cdi.moodchecker;

@Good
public class GoodMood implements MoodChecker {

	public String checkMood() {
		return "I feel great !";
	}

}
