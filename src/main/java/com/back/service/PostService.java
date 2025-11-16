package com.back.service;

import com.back.DAO.Post;
import com.back.DTO.PostDTO;
import com.back.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostService {
    private final PostRepository postRepository;
    private final Post post;

    public Post addPost(PostDTO.CreatePostDTO createPostDTO) {
        Post addPost = new Post();
        addPost.setTitle(createPostDTO.getTitle());
        addPost.setContent(createPostDTO.getContent());
        addPost.setAuthor(createPostDTO.getAuthor());
        log.info(addPost.getPostnum()+"번 게시글이 작성되었습니다.");
        return postRepository.save(addPost);
    }

    public List<Post> findAll(){
        return postRepository.findAll();
    }
}
