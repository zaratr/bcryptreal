package com.bcrypt.bcrypt.controller;

import com.bcrypt.bcrypt.model.SiteUser;
import com.bcrypt.bcrypt.repository.PostsRepository;
import com.bcrypt.bcrypt.repository.SiteUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController
{
    @Autowired
    SiteUserRepository siteUserRepository;
    @Autowired
    PostsRepository postsRepository;

    @GetMapping("/home/{username}")
    public String getSecretPage(@PathVariable String username, Model mdl)
    {
        SiteUser siteUserToView = siteUserRepository.findByUsername(username);
        mdl.addAttribute("username", username.toLowerCase());
        mdl.addAttribute("siteUser", siteUserToView);
        mdl.addAttribute("posts", siteUserToView.getPostsList());
        return "home.html";
    }


}
