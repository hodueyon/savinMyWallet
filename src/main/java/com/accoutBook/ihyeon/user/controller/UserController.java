package com.accoutBook.ihyeon.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String mainPage(){
        return "main";
    }

    @GetMapping("/signInForm")
    public String signinform(){
        return "/user/signinform";
    }

    //회원가입

    //중복검사

    //아이디 비밀번호 찾기 폼 이동


    //

}
