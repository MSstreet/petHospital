package com.msproject.pet.service;

import com.msproject.pet.entity.Member;
import com.msproject.pet.repository.MemberRepository;
import com.msproject.pet.web.dtos.MemberDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class MemberServiceTest {


    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberRepository memberRepository;


    @Test
    @DisplayName("회원가입")
    void test1(){

        MemberDto memberDto = MemberDto.builder()
                .loginId("aaa")
                .password("123")
                .nickName("bbb")
                .phoneNum("111")
                .build();

        memberService.join(memberDto);

        Member member = memberRepository.findAll().get(0);
        assertEquals("aaa",member.getLoginId());
        assertEquals("123",member.getPassword());

    }

}