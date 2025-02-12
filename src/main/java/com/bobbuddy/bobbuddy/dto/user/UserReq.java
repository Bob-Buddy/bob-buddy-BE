package com.bobbuddy.bobbuddy.dto.user;

import lombok.Getter;

@Getter
public class UserReq {

    public static class SignUp {
        private String email;
        private String username;
        private String password;
    }

    @Getter
    public static class Login {
        private String email;
        private String password;
    }
}
