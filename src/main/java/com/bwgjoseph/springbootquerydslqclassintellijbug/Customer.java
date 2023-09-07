package com.bwgjoseph.springbootquerydslqclassintellijbug;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document
public class Customer {
    @Id
    private String id;
    private String name;
}
