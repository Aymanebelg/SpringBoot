package com.example.user.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
@CrossOrigin


public class Users {
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int user_id;
    @Column(name="user_name")
    private String user_name;
    @Column(name="user_lastname")
    private String user_lastname;
    @Column(name="email")
    private String email;

    // @OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL)
    //private List<Posts> posts;

}
