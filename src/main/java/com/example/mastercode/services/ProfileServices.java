package com.example.mastercode.services;

import com.example.mastercode.entities.Profile;
import com.example.mastercode.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProfileServices implements BaseService<Profile>{

    private final ProfileRepository profileRepository;

    public ProfileServices(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    @Transactional
    public List<Profile> findAll() throws Exception {

        try {

            List <Profile> entities = profileRepository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Profile findById(Long id) throws Exception {

        try {
            Optional<Profile> entityOptional = profileRepository.findById(id);
            return entityOptional.get();

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Profile create(Profile entity) throws Exception {
        try {
            entity = profileRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Profile update(Long id, Profile entity) throws Exception {
        try {
            Optional<Profile> profileOptional = profileRepository.findById(id);
            Profile profileUpdate = profileOptional.get();
            profileUpdate = profileRepository.save(entity);
            return profileUpdate;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {

        try {
            if (profileRepository.existsById(id)) {
                profileRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
