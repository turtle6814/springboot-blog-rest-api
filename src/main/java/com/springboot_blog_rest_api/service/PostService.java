package com.springboot_blog_rest_api.service;

import com.springboot_blog_rest_api.payload.PostDto;
import com.springboot_blog_rest_api.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePost(long id);

    List<PostDto> getPostsByCategory(Long categoryId);
}
