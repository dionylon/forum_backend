package com.dionysun.forum.service;

import com.dionysun.forum.dao.CommentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentDao commentDao;

}
