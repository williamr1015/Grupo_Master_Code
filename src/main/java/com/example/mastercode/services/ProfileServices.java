package com.example.mastercode.services;

import com.example.mastercode.entities.Profile;
import com.example.mastercode.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileServices {

    private final ProfileRepository profileRepository;

    public ProfileServices(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public List<Profile> getProfile(){
        return profileRepository.findAll();
    }

    public Profile createProfile(Profile profileName){
        return profileRepository.save(profileName);
    }
}
