package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pawel on 07.04.16.
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/", "home", "index"})
    public String index() {
        return "index";
    }
}
