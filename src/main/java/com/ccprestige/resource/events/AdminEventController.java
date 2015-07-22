package com.ccprestige.resource.events;

import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/amdin/events")
@ExposesResourceFor(Event.class)
public class AdminEventController {

	@RequestMapping(value="/show", method = RequestMethod.GET)
	public ModelAndView show() {
		return null;
	}
}
