package cl.karangop.shrinkquizz.data;

/**
 * Created by karan_000 on 10-02-2017.
 */

public class MatchAnswer {

    private int userAge, loverAge;

    public MatchAnswer(int userAge, int loverAge) {
        this.userAge = userAge;
        this.loverAge = loverAge;
    }

    public int getUserAge() {
        return userAge;
    }

    public int getLoverAge() {
        return loverAge;
    }
}
