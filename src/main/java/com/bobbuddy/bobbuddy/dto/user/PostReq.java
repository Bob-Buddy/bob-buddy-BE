package com.bobbuddy.bobbuddy.dto.user;

import lombok.Getter;

public class PostReq {

    @Getter
    public static class CreatePost {
        private String title;
        private String content;
        private String author;
    }
}
