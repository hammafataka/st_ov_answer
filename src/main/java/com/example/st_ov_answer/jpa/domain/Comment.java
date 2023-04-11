package com.example.st_ov_answer.jpa.domain;

import javax.persistence.*;

/**
 * @author HAMMA FATAKA (mfataka@monetplus.cz)
 * @project st_ov_answer
 * @date 09.04.2023 2:51
 */
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private int commentId;

    @Column(name = "content")
    private String content;

    @Column(name = "product_id")
    private int productId;

    public Comment() {
    }

    public Comment(String content) {
        this.content = content;
    }

    public Comment(String content, int productId) {
        this.content = content;
        this.productId = productId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
