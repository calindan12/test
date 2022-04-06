package com.example.test;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
@RestController
public class controller {
    @GetMapping(value = "/add/first/{first}/second/{second}")
        public Integer metoda(@PathVariable Integer first , @PathVariable Integer second){
        int r = first + second;
        return r;
        }
}
