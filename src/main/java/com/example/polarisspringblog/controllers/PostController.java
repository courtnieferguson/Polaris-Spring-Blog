package com.example.polarisspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class PostController {

    @GetMapping("/posts/{id}")
    @ResponseBody
    String showPosts(@PathVariable int id) {
        return "viewing post with id of" + id;
    }
}
