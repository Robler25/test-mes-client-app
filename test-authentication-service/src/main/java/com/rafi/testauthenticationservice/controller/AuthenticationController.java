package com.rafi.testauthenticationservice.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.*;


@RestController
public class AuthenticationController {


    @PostMapping("/authentication")
    @ResponseBody
    public String authenticate(@RequestBody JSONObject json) {

        System.out.println("Called");

        if (json.get("username").equals("admin") && json.get("password").equals("admin")) {
            return "authenticated";
        } else if (json.get("username").equals("gast") && json.get("password").equals("gast")) {
            return "authenticated";
        } else {
            return "unauthenticated";
        }
    }
}
