package com.ccprestige.resource.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

	private final ProfileRepository profileRepository;
	
	@Autowired
	public ProfileService(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}
	
	public Profile getProfile(Long profileId) {
		return profileRepository.findOne(profileId);
	}
}
