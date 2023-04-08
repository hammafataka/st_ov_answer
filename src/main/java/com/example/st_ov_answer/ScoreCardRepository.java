package com.example.st_ov_answer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HAMMA FATAKA (mfataka@monetplus.cz)
 * @project st_ov_answer
 * @date 09.04.2023 0:41
 */
@Repository
public interface ScoreCardRepository extends JpaRepository<ScoreCard, Long> {
}
