package com.back.controller;
import com.back.dto.PostDTO;
import com.back.service.PostService;
import java.util.Scanner;

public class PostController {
    public PostService postService;
    Scanner scanner = new Scanner(System.in);

    int usercontentnum = scanner.nextInt();

    public void starterController(){
        while(true){
            String usercontent = scanner.nextLine();
            if("등록".equals(usercontent)){
                postService.setPostDTO();
            }
            else if("목록".equals(usercontent)){
                postService.getPostDTOList();
            }
            else if("삭제".equals(usercontent)){
                postService.deletePostDTO(usercontentnum);
            }
            else if("수정".equals(usercontent)){
                postService.updatePostDTO(usercontentnum);
            }
            else if ("종료".equals(usercontent)){
                System.out.println("종료합니다");
                break;
            }
            else{
                System.out.println("잘못된 명령입니다.");
            }
        }
    }
}
