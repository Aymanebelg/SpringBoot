package com.example.user.Service;

import com.example.user.Entity.Posts;
import com.example.user.Entity.Users;
import com.example.user.Repository.PostsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {
    @Autowired
    private PostsRepo postsRepo;
    public Posts savedata(Posts posts){

        return postsRepo.save(posts);
    }

    public List<Posts> getdata(){
        return postsRepo.findAll() ;
    }

    public List<Posts> getuserpost(String email){
        return postsRepo.findPostsByUserEmail(email);
    }

    public Long count(String email){
        return postsRepo.countPostsByEmail((email));
    }


}
