package entity;

public class RoundScore {

    private Integer firstScore;
    private Integer secondScore;

    public Integer getFirstScore() {
        return firstScore;
    }

    public Integer getSecondScore() {
        return secondScore;
    }

    public void setFirstScore(Integer firstScore) {
        if (firstScore <= 10) {
            this.firstScore = firstScore;
        }
        if (firstScore == 10) {
            this.secondScore = 0;
        }
    }

    public void setSecondScore(Integer secondScore) {
        if (this.firstScore != 10 && this.firstScore + secondScore <= 10) {
            this.secondScore = secondScore;
        }
    }
}
