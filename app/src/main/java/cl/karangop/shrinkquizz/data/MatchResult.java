package cl.karangop.shrinkquizz.data;

/**
 * Created by karan_000 on 10-02-2017.
 */

public class MatchResult extends MatchAnswer {


    public MatchResult(int userAge, int loverAge) {
        super(userAge, loverAge);
    }

    public String get(){
        return lover() + user();
    }

    private String lover(){
        if(getLoverAge() != getUserAge()){
            return "Podrían ser más compatibles";
        }
        else{
            return "Qué buena pareja!!";
        }
    }

    private String user(){
/*
        switch (getUserAge()){
            case getUserAge() < 5:
                return "Muy pequeño";

            case 18:
                return "Mayoría de edad";
            default:
                return "otro";

        }*/

        if(getUserAge() < 18){
            return "Juventud!!";
        }
        else if(getUserAge() >=18 && getUserAge() < 60){
            return "La Sabiduria";
        }
        else{
            return "Más sabe el diablo por viejo que por diablo";
        }
    }
}
