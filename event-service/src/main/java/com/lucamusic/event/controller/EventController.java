package com.lucamusic.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lucamusic.event.entity.Event;
import com.lucamusic.event.service.EventService;

@RestController
@RequestMapping("/events")
public class EventController {
	
	@Autowired
	private EventService serv;
	
	@PostMapping("/add")
	public ResponseEntity<Event> createEvent(Event event){
		Event eventCreate = serv.createEvent(event);
		return ResponseEntity.status(HttpStatus.CREATED).body(eventCreate);
	}

	
}
