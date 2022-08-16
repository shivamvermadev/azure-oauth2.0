package com.start.auth.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class OAuth2LoginController {

    @GetMapping("/test")
    public String hello() {
//        System.out.println(principal.getName());
//        System.out.println(principal.toString());
//        System.out.println(oauth2User.getName());
//        System.out.println();
//        System.out.println(auth2AuthorizedClient.getClientRegistration().getClientName());
//        System.out.println();
//        System.out.println(oauth2User.getAttributes());
//
//        model.addAttribute("userName", oauth2User.getName());
//        model.addAttribute("clientName", auth2AuthorizedClient.getClientRegistration().getClientName());
//        model.addAttribute("userAttributes", oauth2User.getAttributes());
        return "index";
    }
}