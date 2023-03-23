package com.Project.service.impl;

import com.Project.dto.ProfileDTO;
import com.Project.entity.Base.Profile;
import com.Project.mapper.MapperUtil;
import com.Project.repository.ProfileRepository;
import com.Project.service.ProfileService;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {
    private final ProfileRepository profileRepository;
    private final MapperUtil mapperUtil;

    public ProfileServiceImpl(ProfileRepository profileRepository, MapperUtil mapperUtil) {
        this.profileRepository = profileRepository;
        this.mapperUtil = mapperUtil;
    }


    @Override
    public ProfileDTO save(ProfileDTO profileDTO) {
        Profile profile = mapperUtil.convert(profileDTO,new Profile());
        Profile savedProfile= profileRepository.save(profile);
        return mapperUtil.convert(savedProfile,new ProfileDTO());
    }
}
