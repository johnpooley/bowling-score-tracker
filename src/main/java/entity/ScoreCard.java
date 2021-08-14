package entity;

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {
    private final List<RoundScore> userScores = new ArrayList<RoundScore>();

    public List<RoundScore> getUserScores() {
        return userScores;
    }

    public void addRoundScore(RoundScore score) {
        userScores.add(userScores.size(), score);
    }

    public RoundScore getScoreFromRound(int round) {
        return userScores.get(round - 1);
    }
}
