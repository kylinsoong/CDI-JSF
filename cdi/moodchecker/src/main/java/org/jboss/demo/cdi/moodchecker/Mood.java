package org.jboss.demo.cdi.moodchecker;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class Mood {

	private String mood;
	
	@Inject
	@Good
	private MoodChecker moodChecker;

	public Mood() {

	}

	public void check() {
		mood = moodChecker.checkMood();
	}

	public String getMood() {
		return mood;
	}
}
