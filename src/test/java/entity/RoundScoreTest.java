package entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundScoreTest {

    private RoundScore score = new RoundScore();

    @Test
    public void firstScoreOfTenSetsSecondScore() {
        assertNull(score.getSecondScore());
        score.setFirstScore(10);

        assertEquals(score.getSecondScore(), 0);
    }

    @Test
    public void scoreCannotBeHigherThanTen() {
        score.setFirstScore(11);
        assertNull(score.getFirstScore());
    }

}