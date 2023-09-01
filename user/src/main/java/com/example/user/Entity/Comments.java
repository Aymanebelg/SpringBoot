package com.example.user.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Comments")
@AllArgsConstructor
@NoArgsConstructor
public class Comments {
    @Id
    @Column(name="comment_id")
    private int comment_id;
    @Column(name="comment_content")
    private String comment_content;
    @Column(name="comment_date")
    private String comment_date;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private Users users;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="post_id")
    private Posts posts;
}
