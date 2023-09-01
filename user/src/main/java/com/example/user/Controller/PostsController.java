package com.example.user.Controller;

import com.example.user.Entity.Posts;
import com.example.user.Entity.Users;
import com.example.user.Service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostsController {
    @Autowired
    private PostsService postsService;
    @PostMapping("/addpost")
    public Posts postdetails(@RequestBody Posts posts){
        return postsService.savedata(posts);
    }
    @GetMapping("/getallposts")
    public List<Posts> getpost(){
        return postsService.getdata();
    }


   @GetMapping("userpost/{email}")
    public List<Posts> getuserp(@PathVariable String email){
    return postsService.getuserpost(email);
   }

   @GetMapping("count/{email}")
    public Long countpost(@PathVariable String email){
        return postsService.count(email);
   }

}
