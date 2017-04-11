package cl.karangop.shrinkquizz.data;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by karan_000 on 08-02-2017.
 */

public class LuckyAnswer {

    private boolean happy, luckyDay;

    public LuckyAnswer(boolean happy) {
        this.happy = happy;
        new DayResolver().setLucky(); //Constructor del tipo fachada
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public boolean isLuckyDay() {
        return luckyDay;
    }

    public void setLuckyDay(boolean luckyDay) {
        this.luckyDay = luckyDay;
    }

    private class DayResolver{

        private Date date= new Date();
        private SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd"); //yyyy/MM/dd

        public void setLucky(){
            String dayS= simpleDateFormat.format(date);
            //Log.d("DAY",dayS);
            int day= Integer.parseInt(dayS);

            if (day%2 == 0){ // %: modules--> significa ver el resto de la división
                setLuckyDay(true);
            }
            else
                setLuckyDay(false);
        }

    }
}
