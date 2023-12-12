package com.ll.medium.domain.member.member.controller;

import com.ll.medium.domain.member.member.repository.MemberRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController
{
    private final MemberRepository memberRepository;

    @Getter
    @Setter
    public static class JoinForm
    {
        private String username;
        private String password;
    }


    @PostMapping("/join")
    String showJoin(JoinForm joinForm)
    {
        return "redirect:/";
    }

    @GetMapping("/join")
    String showJoin2()
    {
        return "domain/member/member/join";
    }

    @GetMapping("/login")
    String showLogin()
    {
        return "domain/member/member/login";
    }
}
