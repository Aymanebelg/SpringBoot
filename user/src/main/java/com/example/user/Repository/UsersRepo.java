package com.example.user.Repository;

import com.example.user.Entity.Posts;
import com.example.user.Entity.Users;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

@Repository
public interface UsersRepo extends JpaRepository<Users,Integer> {
    public Users findByEmail(String email);


    public void deleteByEmail(String email);

}
