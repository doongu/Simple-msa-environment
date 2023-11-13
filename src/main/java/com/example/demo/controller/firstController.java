package com.example.demo.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class firstController {

    @RequestMapping("/restTest")
    public String restTest(@RequestParam String str){
        return str + " : Rest Test 완료@@@@";
    }
}
