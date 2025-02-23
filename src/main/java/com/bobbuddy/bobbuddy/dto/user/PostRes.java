package com.bobbuddy.bobbuddy.dto.user;

import lombok.Getter;
import lombok.Setter;

public class PostRes {

    @Getter
    @Setter
    public static class getPost {
        private String title;
        private String content;
        private String author;
    }

}
