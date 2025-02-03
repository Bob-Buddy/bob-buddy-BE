package com.bobbuddy.bobbuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BobBuddyApplication {
    public static void main(String[] args) {
        SpringApplication.run(BobBuddyApplication.class, args);
//        GetUserReq temp = new GetUserReq("초원",100);

//        String name = temp.getName();
//        temp.setName("cho"); // 필드가 10개 가 있으면 10개쓰나??
    }

}
