package com.billwang2001;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormHandler {
    @RequestMapping("/form")
    public String form(@RequestBody ContactForm input) {
        ContactForm form = input;

        return "success";
    }
}