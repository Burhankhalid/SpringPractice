package com.masterclass.masterclass.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoContoller {

//    @RequestMapping(value= "/morning", method= RequestMethod.GET)
    @GetMapping("/morning")
    public String helloworld() {
        return ("Good Morning Burhan, Let's GET ITTT!!!! (p.s I LOVE YOU)");
    }
}
