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
     * 회원조회
     */
    public void getUser(String id) {
        boolean bool = userRepository.existsById(id);

        if(bool) {
            throw new RuntimeException("이미 존재하는 Email");
        }
    }

    /**
     * 회원가입
     */
    public void signUp(PostUserReq userReq) {
        // 회원이 이미 존재하는지 확인. -> 존재하면 exception.
        getUser(userReq.getEmail());

        // 클래스를 호출하는 법
        UserEntity entity = new UserEntity();
        entity.setEmail(userReq.getEmail());
        entity.setUsername(userReq.getUsername());
        entity.setPassword(userReq.getPassword());

        userRepository.save(entity);
    }

    public void login(UserReq.Login userReq) {

       UserEntity user = userRepository.findById(userReq.getEmail()).orElseThrow(
               () -> new RuntimeException("해당하는 이메일이 없습니다.")
       );

        String password = user.getPassword();

        if (password.equals(userReq.getPassword())) {
            return;
        }

        throw new RuntimeException("비밀번호가 일치하지 않습니다.");
    }

    // 서비스 - 레포 - jpa - 디비
}
