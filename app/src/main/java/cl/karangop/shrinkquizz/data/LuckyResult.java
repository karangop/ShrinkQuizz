package cl.karangop.shrinkquizz.data;

/**
 * Created by karan_000 on 08-02-2017.
 */

public class LuckyResult extends LuckyAnswer {

    public LuckyResult(boolean happy) {
        super(happy);
    }

    public String get(){
        return day() + happy();
    }

    private String day(){
        if (isLuckyDay()){
            return "Aprovecha el día ";
        }
        else {
            return "Mejor te guardas hoy ";
        }
    }

    private String happy(){
        if (isHappy())        {
            return "Comprate un loto ";
        }else{
            return "Mañana será otro día ";
        }
    }
}
