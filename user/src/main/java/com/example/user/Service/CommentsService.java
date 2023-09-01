package com.example.user.Service;

import com.example.user.Entity.Comments;
import com.example.user.Entity.Posts;
import com.example.user.Repository.CommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsService {
    @Autowired
    private CommentsRepo commentsRepo;
    public Comments savedata(Comments comments){
        return commentsRepo.save(comments);
    }

    public List<Comments> getdata(){
        return commentsRepo.findAll() ;
    }
}
