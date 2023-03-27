package com.Project.Controller;

import com.Project.dto.ProfileDTO;
import com.Project.entity.Base.Profile;
import com.Project.repository.ProfileRepository;
import com.Project.service.ProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    private final ProfileRepository profileRepository;
    private final ProfileService profileService;

    public ProfileController(ProfileRepository profileRepository, ProfileService profileService) {
        this.profileRepository = profileRepository;
        this.profileService = profileService;
    }

    @RequestMapping("")
    public String getProfilePage(Model model){
        model.addAttribute("profile",new Profile());
        return "profile.html";
    }

    @PostMapping("/create")
    public String insertProfile(@ModelAttribute("newProfile") ProfileDTO profileDTO, Model model){
        model.addAttribute("newProfile", new ProfileDTO());
        profileService.save(profileDTO);
        return "redirect:/profile";
    }


}
