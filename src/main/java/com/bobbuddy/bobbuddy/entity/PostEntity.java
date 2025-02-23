package com.bobbuddy.bobbuddy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "POST")
@Getter
@Setter
public class PostEntity extends TimeEntity {

    @Id
    private Long id;

    private String title;
    private String content;
    private String author;
}
