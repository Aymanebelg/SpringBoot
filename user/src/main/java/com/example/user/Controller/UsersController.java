package com.example.user.Controller;

import com.example.user.Entity.Posts;
import com.example.user.Entity.Users;
import com.example.user.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @PostMapping("/adduser")
    public Users userdetails(@RequestBody Users users) {
        return usersService.savedata(users);
    }


    @GetMapping("/getallusers")
    public List<Users> getuser() {
        return usersService.getdata();
    }

    @GetMapping("/getby/{email}")
    public Users getbyemail(@PathVariable String email) {
        return usersService.getby(email);
    }

    @PutMapping("/update/{email}")
    public Users updateuser(@RequestBody Users users) {
        return usersService.update(users);
    }

    @DeleteMapping("/delete/{email}")
    public String deleteuser(@PathVariable String email) {
      return  usersService.deleteuser(email);

    }



}
