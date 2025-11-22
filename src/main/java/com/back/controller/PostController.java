package com.back.controller;
import com.back.dto.PostDTO;
import com.back.service.PostService;
import java.util.Scanner;

public class PostController {
    Scanner scanner = new Scanner(System.in);

    public void starterController(){
        PostService postService = new  PostService();
        while(true){
            String usercontent = scanner.nextLine();
            int usercontentnum = 0;
            for(int i=0; i<=usercontent.length(); i++){
                char ch = usercontent.charAt(i);
                if(48<=ch && ch<=57){
                    usercontentnum = ch;
                }
            }
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
