package com.bobbuddy.bobbuddy.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity(name="USER")
@Getter
public class UserEntity extends TimeEntity {

    // 기본키
    @Id
    String email;

    @Column
    String username;

    @Column
    String password;

}
