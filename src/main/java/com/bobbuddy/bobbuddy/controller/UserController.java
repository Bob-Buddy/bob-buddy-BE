package com.bobbuddy.bobbuddy.controller;

import com.bobbuddy.bobbuddy.entity.UserEntity;
import com.bobbuddy.bobbuddy.repository.UserRepository;
import com.bobbuddy.bobbuddy.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    // 빈을 가져올 때는  private final (클래스이름) (변수이름) 로 가져온다.
    // private final 로 가져올 때는 RequiredArgsConstructor 어노테이션 필수~
    // private final 로 빈을 주입하는 방식은 사실 생성자 주입 방식이다.
    // 프로젝트가 실행될 때 빈(싱글톤 객체)들을 만들어서 필요한 곳에 넣어줌
    // 실행 -> 빈 객체 만듬 -> RequiredArgsConstructor 읽어 ->  private final 있는애들한테 넣어줌.
    private final UserRepository userRepository;


    /**
     * 회원
     * 1. 회원가입
     * 2. 로그인
     * 3. 회원조회
     */

    /**
     * 회원조회
     */
    @GetMapping("/get")
    public String getUser() {
        Optional<UserEntity> byId1 = userRepository.findById("wook");
        return byId1.get().getEmail();
    }

    /**
     * 회원가입
     */

    /**
     *
     */

}
