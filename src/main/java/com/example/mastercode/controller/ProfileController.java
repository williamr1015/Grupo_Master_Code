package com.example.mastercode.controller;

import com.example.mastercode.entities.Profile;
import com.example.mastercode.services.ProfileServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("profile")
public class ProfileController {

    private final ProfileServices profileServices;

    public ProfileController(ProfileServices profileServices) {
        this.profileServices = profileServices;
    }

    @GetMapping()
    public List<Profile> getProfileList() throws Exception {
        return profileServices.findAll();
    }

    @PostMapping()
    public Profile createProfile(@RequestBody Profile request) throws Exception {
        return profileServices.create(request);
    }

    @GetMapping("/{id}")
    public Optional<Profile> getProfileId(@PathVariable Long id) throws Exception {
        return Optional.ofNullable(profileServices.findById(id));
    }

    @PatchMapping("/{id}")
    public Profile modifyProfile(@PathVariable Long id, @RequestBody Profile profile) throws Exception {
        return profileServices.update(id, profile);
    }

    @DeleteMapping("/{id}")
    public boolean deleteProfile(@PathVariable Long id) throws Exception {
        return profileServices.delete(id);
    }
}

