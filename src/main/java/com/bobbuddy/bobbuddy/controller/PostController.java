package com.bobbuddy.bobbuddy.controller;

import com.bobbuddy.bobbuddy.dto.user.PostReq;
import com.bobbuddy.bobbuddy.dto.user.PostRes;
import com.bobbuddy.bobbuddy.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    @GetMapping("/get")
    /**
     * 게시물 조회
     */
    public ResponseEntity<PostRes.getPost> getPost(@RequestParam Long id) {
        PostRes.getPost res = postService.getPost(id);
        return ResponseEntity.ok().body(res);
    }

    /**
     * 게시물 생성
     */
    @PostMapping("/create")
    public ResponseEntity<String> createPost(@RequestBody PostReq.CreatePost postReq) {
        postService.createPost(postReq);
        return ResponseEntity.ok().body("게시물 등록 완료!!");

        /**
         * 빈 만들기, 빈 가져오는 법
         * getter, setter
         * repository가 어떤 느낌인지.
         */
    }
}
