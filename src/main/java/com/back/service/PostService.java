package com.back.service;
import com.back.DTO.PostDTO;
import com.back.repository.PostRepository;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class PostService {
    public PostRepository postRepository = new PostRepository();
    private Scanner scanner = new Scanner(System.in);
    private int postSequence = 0;

        public void setPostDTO() {
            System.out.print("내용 : ");
            String content = scanner.nextLine();
            System.out.print("저자 : ");
            String author = scanner.nextLine();

            PostDTO postDTO = new PostDTO();
            postSequence++;
            postDTO.setPostnum(postSequence);
            postDTO.setContent(content);
            postDTO.setAuthor(author);
            postRepository.postDTOMap.put(postDTO.getPostnum(), postDTO);
            System.out.println(postDTO.getPostnum() + "번 게시글이 등록되었습니다.");
        }

        public void deletePostDTO(int postnum) {
            PostDTO removedPost = postRepository.postDTOMap.remove(postnum);
            if (removedPost != null) {
                System.out.println(postnum + "번 게시글이 삭제되었습니다.");
            } else {
                System.out.println(postnum + "번 게시글을 찾을 수 없습니다.");
            }
        }
        public void getPostDTOList() {
            List<PostDTO> postList = new ArrayList<>(postRepository.postDTOMap.values());
            if (postList.isEmpty()) {
                System.out.println("게시글이 없습니다.");
                return;
            }
            postList.sort(Comparator.comparingInt(PostDTO::getPostnum).reversed());
            for (PostDTO post : postList) {
                System.out.println(post.getPostnum() + " / " + post.getAuthor() + " / " + post.getContent());
            }
        }
        public void updatePostDTO(int postnum) {
            PostDTO postToUpdate = postRepository.postDTOMap.get(postnum);
            if (postToUpdate != null) {
                System.out.println("내용(기존) : " + postToUpdate.getContent());
                System.out.print("내용(수정) : ");
                String newContent = scanner.next();
                System.out.println("작성자(기존) : " + postToUpdate.getAuthor());
                System.out.print("작성자(수정) : ");
                String newAuthor = scanner.next();
                postToUpdate.setContent(newContent);
                postToUpdate.setAuthor(newAuthor);
                System.out.println(postnum + "번 게시글이 수정되었습니다.");
            } else {
                System.out.println(postnum + "번 게시글을 찾을 수 없습니다.");
            }
        }
}