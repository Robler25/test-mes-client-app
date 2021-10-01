package com.rafi.testsessionservice.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SessionController {

    private Map<String, JSONObject> activeSessions = new HashMap<>();


    @GetMapping("/allSessions")
    public Map<String, JSONObject> getSessions ()
    {
        return activeSessions;
    }

    @PostMapping("/addSession")
    @ResponseBody
    public String addSession(@RequestBody String sessionKey)
    {
        System.out.println("Called");
        JSONObject json = new JSONObject();
        // TODO: Load Session-Data into JsonObject

        activeSessions.put(sessionKey, json);

        return "ok";
    }

    @PostMapping("/removeSession")
    @ResponseBody
    public String removeSession(@RequestBody String sessionKey)
    {
        activeSessions.remove(sessionKey);

        return "ok";
    }
}
