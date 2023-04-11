package com.example.st_ov_answer.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.st_ov_answer.jpa.domain.Comment;

/**
 * @author HAMMA FATAKA (mfataka@monetplus.cz)
 * @project st_ov_answer
 * @date 09.04.2023 2:53
 */
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
