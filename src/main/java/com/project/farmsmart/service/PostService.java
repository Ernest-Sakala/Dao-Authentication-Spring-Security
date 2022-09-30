package com.project.farmsmart.service;

import com.project.farmsmart.entities.Post;

import java.util.List;

public interface PostService {
    Post savePost(Post post);
    Post getPost(Long id);
    List<Post> getAllPosts();
    Post updatePost(Post post);
    void deletePostById(Long id);
}
