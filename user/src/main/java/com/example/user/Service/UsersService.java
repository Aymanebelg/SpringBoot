package com.example.user.Service;

import com.example.user.Entity.Posts;
import com.example.user.Entity.Users;
import com.example.user.Repository.UsersRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersRepo usersRepo;
    public Users savedata(Users users){
        return usersRepo.save(users);
    }


    public List<Users> getdata(){
    return usersRepo.findAll() ;
    }

    public Users getby(String email){
        return usersRepo.findByEmail(email);
    }


    public Users update(Users users) {
        Users userupdate = usersRepo.findByEmail(users.getEmail());
        if (userupdate != null) {

            userupdate.setUser_id(users.getUser_id());
            userupdate.setUser_name(users.getUser_name());
            userupdate.setUser_lastname(users.getUser_lastname());
            usersRepo.save(userupdate);
            return userupdate;
        }else{
            System.out.println("user not found");        }
        return null;}
    @Transactional
   public String deleteuser(String email){
        usersRepo.deleteByEmail(email);
        return "user deleted";
    }



}

