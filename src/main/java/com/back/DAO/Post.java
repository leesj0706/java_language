package com.back.DAO;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_num")
    private int postnum;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "content")
    private String content;

    public int getPostnum(){
        return postnum;
    }
}
