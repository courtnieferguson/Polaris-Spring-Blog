package com.example.polarisspringblog.repositories;

import com.example.polarisspringblog.models.Post;

public interface PostRepository {

    Post findByTitle(String title);

    Post getPostById(long id);

}
