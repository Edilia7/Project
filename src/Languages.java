import java.util.Date;
import java.util.Scanner;

public class Languages {

    private int level;
    private int listening;
    private int reading;
    private int writing;
    private int speaking;
    private int points;
    private int pointsMarried;
    private Date startDate;
    private Date finalDate;



    Scanner scan = new Scanner(System.in);

    public Languages(){
        this.level = level;
        this.listening = listening;
        this.reading = reading;
        this.writing = writing;
        this.speaking = speaking;
    }
    public void getNivel(){
        System.out.println("Have you submitted an English or French test in the last 2 years? y or n: ");
        String examen = scan.nextLine();

        int i = 0;
        while(examen.equals("y") && i < 2){
            int point = 0;
            System.out.print("Please enter your language level: ");
            level = scan.nextInt();

            if((listening >= 249 && listening <= 279 && reading >= 207 && reading <= 232 && writing >= 310 && writing <= 348 && speaking >= 310 && speaking <= 348) || (listening == 6 && reading == 6 && writing == 6 && speaking == 6)){
                level = 7;
            }else if((listening >= 280 && listening <= 297 && reading >= 233 && reading <= 247 && writing >= 349 && writing <= 370 && speaking >= 349 && speaking <= 370) || (listening == 7.5 && reading == 6.5 && writing == 6.5 && speaking >= 6.5)){
                level = 8;
            }else if((listening >= 298 && listening <= 315 && reading >= 248 && reading <= 262 && writing >= 371 && writing <= 392 && speaking >= 371 && speaking <= 392) || (listening == 8 && (reading == 7.0 || reading == 7.5) && writing == 7 && speaking >= 7)){
                level = 9;
            }else if((listening > 316 && reading > 263 && writing >= 393 && speaking >= 393) || (listening == 8.5 && reading == 8.0 && writing == 7.5 && speaking >= 7.5)){
                level = 10;
            }

            if(level == 7){
                point = 6;
            }else if(level == 8){
                point = 8;
            }else if(level == 9){
                point = 10;
            }else if(level >= 10){
                point = 12;
            }
            points += point;
            i += 1;
            if(i <= 1){
                System.out.print("Do you want to add another test? y or n: ");
                examen = scan.next();
            }
        }
    }

    public void getNivelMarried(){
        System.out.println("Have you submitted an English or French test in the last 2 years? y or n: ");
        String examen = scan.nextLine();

        int i = 0;
        while(examen.equals("y") && i < 2){
            int point = 0;
            System.out.print("Please enter your language level: ");
            level = scan.nextInt();

            if((listening >= 249 && listening <= 279 && reading >= 207 && reading <= 232 && writing >= 310 && writing <= 348 && speaking >= 310 && speaking <= 348) || (listening == 6 && reading == 6 && writing == 6 && speaking == 6)){
                level = 7;
            }else if((listening >= 280 && listening <= 297 && reading >= 233 && reading <= 247 && writing >= 349 && writing <= 370 && speaking >= 349 && speaking <= 370) || (listening == 7.5 && reading == 6.5 && writing == 6.5 && speaking >= 6.5)){
                level = 8;
            }else if((listening >= 298 && listening <= 315 && reading >= 248 && reading <= 262 && writing >= 371 && writing <= 392 && speaking >= 371 && speaking <= 392) || (listening == 8 && (reading == 7.0 || reading == 7.5) && writing == 7 && speaking >= 7)){
                level = 9;
            }else if((listening > 316 && reading > 263 && writing >= 393 && speaking >= 393) || (listening == 8.5 && reading == 8.0 && writing == 7.5 && speaking >= 7.5)){
                level = 10;
            }

            if(level == 7 || level == 8){
                point = 2;
            }else if(level > 9){
                point = 3;
            }
            pointsMarried += point;
            i += 1;
            if(i <= 1){
                System.out.print("Do you want to add another test? y or n: ");
                examen = scan.next();
            }
        }
    }

    public int getPointsMarried(){
        return pointsMarried;
    }

    public int getPoints(){
        return points;
    }
}
