package com.example.st_ov_answer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HAMMA FATAKA (mfataka@monetplus.cz)
 * @project st_ov_answer
 * @date 09.04.2023 0:40
 */
@RestController
public class ScoreCardController {

    private final ScoreCardRepository scoreCardRepository;

    @Autowired
    public ScoreCardController(ScoreCardRepository scoreCardRepository) {
        this.scoreCardRepository = scoreCardRepository;
    }

    @GetMapping(path = "/score/all")
    public List<ScoreCard> getAllScores() {
        return scoreCardRepository.findAll();
    }
}
