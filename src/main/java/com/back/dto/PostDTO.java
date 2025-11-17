package com.back.dto;

public class PostDTO {
    private int postnum;
    private String content;
    private String author;

    public int getPostnum() {return postnum;}
    public void setPostnum(int postnum) {this.postnum = postnum; postnum++;}
    public String getContent() {return content;}
    public void setContent(String content) {this.content = content;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
}
