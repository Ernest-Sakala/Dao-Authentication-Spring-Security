package com.project.farmsmart.service.impl;

import com.project.farmsmart.entities.Post;
import com.project.farmsmart.repository.FarmerRepository;
import com.project.farmsmart.repository.PostRepository;
import com.project.farmsmart.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private FarmerRepository farmerRepository;

    public PostServiceImpl(PostRepository postRepository, FarmerRepository farmerRepository) {
        this.postRepository = postRepository;
        this.farmerRepository = farmerRepository;
    }


    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post getPost(Long id) {
        return postRepository.findById(id).get();
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post updatePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public void deletePostById(Long id) {
        postRepository.deleteById(id);
    }
}
