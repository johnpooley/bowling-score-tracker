package entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreCardTest {

    @Test
    public void iCanAddANewRoundScore() {
        RoundScore roundScore = new RoundScore();
        roundScore.setFirstScore(1);
        roundScore.setSecondScore(5);
        ScoreCard scoreCard = new ScoreCard();
        assertEquals(0, scoreCard.getUserScores().size());
        scoreCard.addRoundScore(roundScore);
        assertEquals(1, scoreCard.getUserScores().size());

    }
}