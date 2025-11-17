package com.back.service;

import com.back.dto.PostDTO;
import com.back.respository.PostRepository;

import java.util.List;

public class PostService {
    public PostRepository postRepository;

    //등록
    public void setPostDTO(PostDTO postDTO) {
        postDTO.setPostnum(postDTO.getPostnum());
        postDTO.setContent(postDTO.getContent());
        postDTO.setAuthor(postDTO.getAuthor());
    }
    
    //삭제
    public void deletePostDTO(PostDTO postDTO) {
        System.out.println(postDTO.getPostnum()+"번 게시글이 삭제되었습니다.");
        postDTO = null;
    }

    //목록 (내림차순)
    public void getPostDTOList() {
        for(int i=List.of().size(); i<=0; i--){
            System.out.println(postRepository.postDTOList.get(i).getPostnum()+" / "+postRepository.postDTOList.get(i).getAuthor()+" / "+postRepository.postDTOList.get(i).getContent());
        }
    }

    //수정
    public void updatePostDTO(PostDTO postDTO) {
        postDTO.setContent(postDTO.getContent());
        postDTO.setAuthor(postDTO.getAuthor());
    }
}
