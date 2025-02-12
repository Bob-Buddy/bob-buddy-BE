package com.bobbuddy.bobbuddy.service;

import com.bobbuddy.bobbuddy.dto.user.PostUserReq;
import com.bobbuddy.bobbuddy.dto.user.UserReq;
import com.bobbuddy.bobbuddy.entity.UserEntity;
import com.bobbuddy.bobbuddy.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    /**
     * 회원가입
     */
    public void signUp(PostUserReq userReq) {

        // 클래스를 호출하는 법
        UserEntity entity = new UserEntity();
        entity.setEmail(userReq.getEmail());
        entity.setUsername(userReq.getUsername());
        entity.setPassword(userReq.getPassword());
        userRepository.save(entity);
    }

    public void login(UserReq.Login userReq) {
        Optional<UserEntity> OpEntity = userRepository.findById(userReq.getEmail());
        UserEntity entity = OpEntity.get();
        String password = entity.getPassword();

        System.out.println(password);
        System.out.println(userReq.getPassword());
        System.out.println(password.equals(userReq.getPassword()));

        if (entity.getEmail().equals(userReq.getEmail()) && password.equals(userReq.getPassword())) {
            return;
        }

        throw new RuntimeException("NO!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    // 서비스 - 레포 - jpa - 디비
}
