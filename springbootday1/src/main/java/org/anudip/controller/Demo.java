package org.anudip.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Demo {

	@GetMapping("/mb")
public String talkMB() {
	return "<body bgcolor='green' text='red'><h1>I am MohunBagan</h1></body>";
}

	@GetMapping("/eb")
	public String talkEB() {
		return "<body bgcolor='yellow' text='red'><h1>I am EastBengal</h1></body>";
}
	@GetMapping("/tt")
	public String talkToKoushik(@RequestParam(required = false) String name) {
		return "<body bgcolor='yellow' text='red'><h1>I am " + name.toUpperCase() + "</h1></body>";

	}
}

