package com.back.service;

import com.back.dto.PostDTO;
import com.back.respository.PostRepository;

import java.util.List;
import java.util.Scanner;

public class PostService {
    public PostRepository postRepository = new PostRepository();
    public PostDTO postDTO;
    Scanner scanner = new Scanner(System.in);
    int postnum = 0;
    //등록
    public void setPostDTO() {
        PostDTO postDTO = new PostDTO();
        System.out.print("내용 : ");
        String content = scanner.next();
        System.out.print("저자 : ");
        String author = scanner.next();

        postDTO.setPostnum(postnum);
        postDTO.setContent(content);
        postDTO.setAuthor(author);
        postnum++;

        System.out.println(postnum+"번 게시글이 등록되었습니다.");
        postRepository.postDTOList.add(postDTO);
    }
    
    //삭제
    public void deletePostDTO(int postnum) {
        postRepository.postDTOList.get(postnum);
        if(postRepository.postDTOList.get(postDTO.getPostnum()-1)!=null) {
            postRepository.postDTOList.remove(postDTO);
            System.out.println(postDTO.getPostnum()+"번 게시글이 삭제되었습니다.");
        }
        else if(postRepository.postDTOList.get(postDTO.getPostnum()-1)==null) {
            System.out.println(postDTO.getPostnum()+"번 게시글을 찾을 수 없습니다.");
        }
    }

    //목록 (내림차순)
    public void getPostDTOList() {
        for(int i=List.of().size(); i<=0; i--){
            if(List.of().size() == 0){
                System.out.println("반환값이 없습니다.");
                break;
            }
            System.out.println(postRepository.postDTOList.get(i).getPostnum()+" / "+postRepository.postDTOList.get(i).getAuthor()+" / "+postRepository.postDTOList.get(i).getContent());
        }
    }

    //수정
    public void updatePostDTO(int postnum) {
        if(postRepository.postDTOList.get(postDTO.getPostnum()-1)!=null) {
            String content = scanner.next();
            String author = scanner.next();
            System.out.println("내용(기존) : "+postDTO.getContent());
            System.out.print("내용 : ");
            postDTO.setContent(content);
            System.out.println("작성자(기존) : "+postDTO.getAuthor());
            System.out.print("작성자 : ");
            postDTO.setAuthor(author);
            postRepository.postDTOList.set(postDTO.getPostnum()-1, postDTO);
        }
        else if(postRepository.postDTOList.get(postDTO.getPostnum()-1)==null) {
            System.out.println(postDTO.getPostnum()+"번 게시글을 찾을 수 없습니다.");
        }
    }


}
