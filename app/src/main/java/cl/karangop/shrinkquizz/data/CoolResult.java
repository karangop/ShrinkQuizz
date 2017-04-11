package cl.karangop.shrinkquizz.data;

/**
 * Created by karan_000 on 06-02-2017.
 */

public class CoolResult extends CoolAnswer {
    public CoolResult(String answer) {
        super(answer);
    }

    public String get()
    {
        if (getAnswer().contains("1")){
            return "Bebes como un bebé";
        }else if(getAnswer().contains("5")){
            return "En hora buena chaval!";
        }else{
            return "Eres una mala junta!";
        }
    }
}
