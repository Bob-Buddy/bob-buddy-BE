package com.bobbuddy.bobbuddy.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name="USER")
@Getter
@Setter
public class UserEntity extends TimeEntity {

    // 기본키
    @Id
    private String email;

    @Column
    private String username;

    @Column
    private String password;

}
