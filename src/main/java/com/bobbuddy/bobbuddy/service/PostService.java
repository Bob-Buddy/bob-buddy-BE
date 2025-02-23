package com.bobbuddy.bobbuddy.service;

import com.bobbuddy.bobbuddy.dto.user.PostReq;
import com.bobbuddy.bobbuddy.dto.user.PostRes;
import com.bobbuddy.bobbuddy.entity.PostEntity;
import com.bobbuddy.bobbuddy.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    /**
     * 게시물 조회
     */
    public PostRes.getPost getPost(Long id) {

        // entity -> resDto
        PostEntity post = postRepository.findById(id).orElseThrow(
                () -> new RuntimeException("게시물이 없어용")
        );

        PostRes.getPost resDto = new PostRes.getPost();
        resDto.setTitle(post.getTitle());
        resDto.setContent(post.getContent());
        resDto.setAuthor(post.getAuthor());

        return resDto;
    }

    /**
     * 게시물 생성
     */
    public void createPost(PostReq.CreatePost postReq) {

        PostEntity postEntity = new PostEntity();
        postEntity.setTitle(postReq.getTitle());
        postEntity.setContent(postReq.getContent());
        postEntity.setAuthor(postReq.getAuthor());

        postRepository.save(postEntity);

    }
}
