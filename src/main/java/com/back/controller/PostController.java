package com.back.controller;
import com.back.dto.PostDTO;
import com.back.service.PostService;
import java.util.Scanner;

public class PostController {
    public PostService postService;
    Scanner scanner = new Scanner(System.in);
    String usercontent = scanner.nextLine();
    int usercontentnum = scanner.nextInt();

    public void starterController(){
        if("등록".equals(usercontent)){
            postService.setPostDTO();
        }
        else if("목록".equals(usercontent)){
            postService.deletePostDTO(usercontentnum);
        }
    }
}
