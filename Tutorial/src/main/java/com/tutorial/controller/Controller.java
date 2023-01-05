package com.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.dao.TutorialDao;
import com.tutorial.model.Tutorial;
import com.tutorial.service.TutorialService;

@RestController
public class Controller {
	@Autowired
	TutorialDao td;
	@Autowired
	TutorialService ts;

	@PostMapping("/test")
	public Tutorial addController(@RequestBody Tutorial tutiorals) {
		return ts.postTutioral(tutiorals);
	}

	@GetMapping("/test/{id}")
	public Tutorial getController(@PathVariable long id) {
		return ts.getTutioral(id);
	}
}
