package com.ll.medium.domain.member.member.controller;

import com.ll.medium.domain.member.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController
{
    private final MemberRepository memberRepository;

    @PostMapping("/join")
    String showJoin()
    {
        return "redirect:/member/member/join";
    }

    @GetMapping("/join")
    String showJoin2(@RequestParam("username") String username,
                     @RequestParam("password") String password)
    {
        return "member/member/join";
    }

    @GetMapping("/login")
    String showLogin()
    {
        return "member/member/login";
    }
}
