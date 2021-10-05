package com.tcs.dockerexample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web-api")
public class WebController {
	
	@CrossOrigin
	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public String json() {
        return "Greetings Hello World - Docker";
    }

}
