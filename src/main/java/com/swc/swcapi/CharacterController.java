package com.swc.swcapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CharacterController {

    @GetMapping("/character")
    public Character character(@RequestParam(value = "name", defaultValue = "Luke Skywalker") String name) {
        return new Character(1, name);
    }
}
