package com.back.repository;

import com.back.DAO.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, String> {
    Optional<Post> findByname(String name);
    Optional<Post> findBytitle(String title);
    List<Post> findAll();
}
