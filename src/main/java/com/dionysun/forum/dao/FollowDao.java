package com.dionysun.forum.dao;

import com.dionysun.forum.entity.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FollowDao extends JpaRepository<Follow, Long> {
    List<Follow> findAllByUserId(Long userId);
    List<Follow> findAllByFollowerId(Long followerId);
}
