package com.dogether.web.controller;

import com.dogether.web.dto.MemberDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public MemberDto memberDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new MemberDto(name, amount);
    }
}
