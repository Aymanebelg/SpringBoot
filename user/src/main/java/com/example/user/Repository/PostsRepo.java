package com.example.user.Repository;

import com.example.user.Entity.Posts;
import com.example.user.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostsRepo extends JpaRepository<Posts,Integer> {

   @Query("SELECT p FROM Posts p JOIN p.user_id u WHERE u.email = :email")
    List<Posts> findPostsByUserEmail(@Param("email") String email);

    @Query("SELECT COUNT(p) FROM Posts p JOIN p.user_id u WHERE u.email = :email")
    Long countPostsByEmail(@Param("email") String email);


}
