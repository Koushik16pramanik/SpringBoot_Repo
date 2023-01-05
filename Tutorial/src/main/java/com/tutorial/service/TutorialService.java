package com.tutorial.service;

import org.springframework.stereotype.Component;

import com.tutorial.model.Tutorial;

@Component
public interface TutorialService {
	Tutorial postTutioral(Tutorial t);

	Tutorial getTutioral(long id);

	Tutorial updateTutioral(Tutorial params, long id);

	String deleteTutioral(long id);
}
