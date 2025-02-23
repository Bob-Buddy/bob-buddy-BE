package com.bobbuddy.bobbuddy.repository;

import com.bobbuddy.bobbuddy.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> {

}
