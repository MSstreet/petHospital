package com.msproject.pet.web.controller;

import com.msproject.pet.service.MemberService;
import com.msproject.pet.web.dtos.MemberDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/users")
@RestController
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/")
    public void join(@RequestBody @Valid MemberDto memberDto){

        memberService.join(memberDto);
    }

}
