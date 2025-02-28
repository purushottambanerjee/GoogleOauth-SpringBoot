package com.puru.GoogleOAuth;


import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/")
    public String Home(){
        return  "Service is Up!!";
    }
    @RequestMapping("/user")
    public Principal getUser(Principal userInfo){
        return  userInfo;
    }

}
