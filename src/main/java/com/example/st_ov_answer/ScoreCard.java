package com.example.st_ov_answer;

import java.io.Serializable;

import javax.persistence.*;

/**
 * @author HAMMA FATAKA (mfataka@monetplus.cz)
 * @project st_ov_answer
 * @date 09.04.2023 0:36
 */
@Entity
@Table(name = "SCORE_CARD")
public class ScoreCard implements Serializable {

    public static final int DEFAULT_SCORE = 10;
    private static final long serialVersionUID = -2504167837465532618L;

    @Id
    @GeneratedValue
    @Column(name = "CARD_ID")
    private final Long cardId;

    @Column(name = "USER_ID")
    private final Long userId;

    @Column(name = "ATTEMPT_ID")
    private final Long attemptId;

    @Column(name = "SCORE_TS")
    private final Long scoreTimestamp;

    @Column(name = "SCORE")
    private final int score;

    @Column(name = "CORRECT")
    private final boolean correct;

    public ScoreCard(Long cardId, Long userId, Long attemptId, Long scoreTimestamp, int score,
                     boolean correct) {
        this.cardId = cardId;
        this.userId = userId;
        this.attemptId = attemptId;
        this.scoreTimestamp = scoreTimestamp;
        this.score = correct ? DEFAULT_SCORE : 0;
        this.correct = correct;
    }

    public ScoreCard() {
        this(null, null, null, null, 0, false);
    }

    public ScoreCard(Long userId, Long attemptId, boolean correct) {
        this(null, userId, attemptId, System.currentTimeMillis(), 0, correct);
    }

    public Long getCardId() {
        return cardId;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getAttemptId() {
        return attemptId;
    }

    public Long getScoreTimestamp() {
        return scoreTimestamp;
    }

    public long getScore() {
        return score;
    }

    public boolean isCorrect() {
        return correct;
    }

}
