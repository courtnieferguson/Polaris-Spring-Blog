package com.example.polarisspringblog.models;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(nullable = false, columnDefinition = "TEXT")

    private long id;
    private String title;
    private String body;

    public Post() {

    }

}

