package org.pubpasim.twitter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/main")
public class MainController {

    @GetMapping("/array")
    public List<Integer> array() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        return numbers;
    }

    @GetMapping("/object")
    public Map<String, Object> object() {
        Map<String, Object> user = new HashMap<>();
        user.put("name", "Romi Kusuma Bakti");
        user.put("email", "romikusumab@gmail.com");
        user.put("age", 21);

        Map<String, Object> generation = new HashMap<>();
        generation.put("number", 18);
        generation.put("name", "Jarvis");

        user.put("generation", generation);
        return user;
    }
}
