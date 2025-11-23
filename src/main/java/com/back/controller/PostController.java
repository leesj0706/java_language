package com.back.controller;
import com.back.service.PostService;
import java.util.Scanner;

public class PostController {
    Scanner scanner = new Scanner(System.in);

    public void starterController(){
        PostService postService = new  PostService();
        while(true){
            String usercontent = scanner.nextLine();

            if(usercontent.contains("?")){
                String[] parts = usercontent.split("\\?");
                String command = parts[0];
                String quarry = parts[1];
                String[] keyvalues = quarry.split("=");
                String key = keyvalues[0];
                String value = keyvalues[1];
                int usercontentnum = Integer.parseInt(key);

                if("삭제".equals(command)){
                    postService.deletePostDTO(usercontentnum);
                }
                else if("수정".equals(command)){
                    postService.updatePostDTO(usercontentnum);
                }
            }
            else {
                if ("등록".equals(usercontent)) {
                    postService.setPostDTO();
                } else if ("목록".equals(usercontent)) {
                    postService.getPostDTOList();
                } else if ("종료".equals(usercontent)) {
                    System.out.println("종료합니다");
                    break;
                } else {
                    System.out.println("잘못된 명령입니다.");
                }
            }
        }
    }
}
