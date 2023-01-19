package com.msproject.pet.service;

import com.msproject.pet.entity.Member;
import com.msproject.pet.repository.MemberRepository;
import com.msproject.pet.web.dtos.MemberDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class MemberService {

    private final MemberRepository memberRepository;


    public void join(MemberDto memberDto) {

        Member member = Member.builder()
                .loginId(memberDto.getLoginId())
                .password(memberDto.getPassword())
                .nickName(memberDto.getNickName())
                .phoneNum(memberDto.getPhoneNum())
                .build();

        memberRepository.save(member);
    }
}
