package com.ccprestige.resource.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@ExposesResourceFor(Event.class)
public class EventController {

	private final EventService eventService;
	
	@Autowired
	public EventController(EventService eventService) {
		this.eventService = eventService;
	}
	
	@RequestMapping(value="/event/{id}", method=RequestMethod.GET)
	public Event read(@PathVariable("id") Long id) {
		return eventService.getEvent(id);
	}
}
