package com.back.DTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {
    private String title;
    private String content;
    private String author;

    public static class CreatePostDTO {
        private String title;
        private String content;
        private String author;

        public String getTitle() {
            return title;
        }
        public String getContent() {
            return content;
        }
        public String getAuthor() {
            return author;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public void setContent(String content) {
            this.content = content;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
    }

    public static class UpdatePostDTO {
        private String title;
        private String content;
        private String author;
        public String getTitle() {
            return title;
        }
        public String getContent() {
            return content;
        }
        public String getAuthor() {
            return author;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public void setContent(String content) {
            this.content = content;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
    }
}
