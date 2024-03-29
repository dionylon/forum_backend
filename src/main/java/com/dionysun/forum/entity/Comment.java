package com.dionysun.forum.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long articleId;
    private Long authorId;
    private String content;
    private Date createTime;
    @Transient
    private Integer thumbUp;
    @Transient
    private UserInfo authorInfo;
}
