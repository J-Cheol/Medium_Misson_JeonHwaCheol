package com.ll.medium.domain.member.member.controller;

import com.ll.medium.domain.member.member.entity.Member;
import com.ll.medium.domain.member.member.service.MemberService;
import com.ll.medium.global.rq.Rq.Rq;
import com.ll.medium.global.rsData.RsData.RsData;
import jakarta.validation.Valid;
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
    private final MemberService memberService;
    private final Rq rq;

    @Getter
    @Setter
    public static class JoinForm
    {
        private String username;
        private String password;
    }


    @PostMapping("/join")
    String showJoin(@Valid JoinForm joinForm)
    {

        RsData<Member> joinRs = memberService.join(joinForm.getUsername(), joinForm.getPassword());
        return rq.redirectOrBack(joinRs, "/member/login");
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
