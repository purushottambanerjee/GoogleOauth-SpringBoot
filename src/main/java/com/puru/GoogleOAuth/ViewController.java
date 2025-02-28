package com.puru.GoogleOAuth;


import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/profile")
    public String Profile(OAuth2AuthenticationToken token, Model model){
        //injecting thyme leaf variables , to check for the attribute name visit {/user}
        model.addAttribute("name",token.getPrincipal().getAttribute("name"));
        model.addAttribute("email",token.getPrincipal().getAttribute("email"));
        model.addAttribute("picture",token.getPrincipal().getAttribute("picture"));

        return "user-profile";

    }

    @RequestMapping("/login")
    public  String Login(){

        return "login";
    }
}
