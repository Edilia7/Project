import java.util.Date;
import java.util.Scanner;

public class StayCanada {
    private int time;
    private Date startdate;
    private Date finaldate;
    private int points;
    Scanner scan = new Scanner(System.in);

    public StayCanada() {
        this.time = time;
        this.startdate = startdate;
        this.finaldate = finaldate;

    }

    public void time(){
        System.out.println("Have you visited Canada in the last 5 years? y or n: ");
        String stay = scan.nextLine();
        if(stay.equals("y")){
            System.out.print("How long have you been in Canada (answer in day)?: ");
            time = scan.nextInt();
//            System.out.print("Please write the date (DD MM YY) you arrived in Canada: ");
//            startDate[0] = scan.nextInt();
//            startDate[1] = scan.nextInt();
//            startDate[2] = scan.nextInt();
//            System.out.print("Please write the date that left Canada: ");
//            finalDate[0] = scan.nextInt();
//            finalDate[1] = scan.nextInt();
//            finalDate[2] = scan.nextInt();
            if(time >= 14 && time <= 90){
                points = 1;
            }else if(time >= 90 && time <= 180){
                points = 2;
            }else if(time > 180) {
                points = 5;
            }
        }
    }
    public int getPoints(){
        return points;
    }
}
