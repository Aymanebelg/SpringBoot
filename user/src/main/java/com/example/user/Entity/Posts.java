package com.example.user.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="posts")
@AllArgsConstructor
@NoArgsConstructor
public class Posts {
    @Id
    @Column(name="post_id")
    private int post_id;
    @Column(name="post_content")
    private String post_content;
    @Column(name="post_date")
    private String post_date;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private Users user_id;


}
