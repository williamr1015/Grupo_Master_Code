package com.example.mastercode.controller;

import com.example.mastercode.entities.Profile;
import com.example.mastercode.services.ProfileServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileController {

    private final ProfileServices profileServices;

    public ProfileController(ProfileServices profileServices) {
        this.profileServices = profileServices;
    }

    @GetMapping("/profile")
    public List<Profile> getEmployee() {
        return this.profileServices.getProfile();
    }

    @PostMapping("/profile")
    public Profile createEmployee(@RequestBody Profile request) {

        return this.profileServices.createProfile(request);
    }
}
