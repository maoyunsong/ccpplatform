package com.ccprestige.resource.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profiles")
@ExposesResourceFor(Profile.class)
public class ProfileController {

	private final ProfileService profileService;
	
	@Autowired
	public ProfileController(ProfileService profileService) {
		this.profileService = profileService;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET , name="self")
	public Profile read(@PathVariable("id") Long id) {
		return profileService.getProfile(id);
	}
}
