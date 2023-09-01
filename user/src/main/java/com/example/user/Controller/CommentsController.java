package com.example.user.Controller;

import com.example.user.Entity.Comments;
import com.example.user.Entity.Posts;
import com.example.user.Service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentsController {
    @Autowired
    private CommentsService commentsService;


    @PostMapping("/addcomment")
    public Comments postdetails(@RequestBody Comments comments){
        return commentsService.savedata(comments);
    }

    @GetMapping("/getallcomments")
    public List<Comments> getpost(){
        return commentsService.getdata();
    }

}
