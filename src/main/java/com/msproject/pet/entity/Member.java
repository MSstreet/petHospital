package com.msproject.pet.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;


    private String loginId;

    private String password;

    private String nickName;

    private String phoneNum;

    @Builder
    public Member(String loginId, String password, String nickName, String phoneNump){
        this.loginId = loginId;
        this.password = password;
        this.nickName = nickName;
        this.phoneNum = phoneNump;
    }

//    private String zipCode;
//
//    private String address;
//
//    private String detailAddress;
//
//    private boolean deleteYn;
//
//    private LocalDateTime createdAt;
//
//    private LocalDateTime updatedAt;
}
