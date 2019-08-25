import java.util.Date;
import java.util.Scanner;

public class WorkExperience {
    private int time;
    private int points;
    private String companyName;
    private int yearExperience;
    private Date startDate;
    private Date finalDate;
    private String descriptionWork;
    Scanner scan = new Scanner(System.in);

    public WorkExperience() {
        this.time = time;
        this.companyName = companyName;
        this.yearExperience = yearExperience;
        this.startDate = startDate;
        this.finalDate = finalDate;
        this.descriptionWork = descriptionWork;
    }

    public void getTime(){
        System.out.println("Do you have work experience? y or n: ");
        String experience = scan.nextLine();

        if(experience.equals("y")){
            System.out.print("Please enter your experience in months: ");
            time = scan.nextInt();
            if(time >= 6 && time < 24){
                points = 4;
            }else if(time >= 24 && time < 48){
                points = 6;
            }else if(time >= 48){
                points = 8;
            }else{
                points = 0;
            }
        }else{
            points = 0;
        }
    }

    public int getPoints(){
        return points;
    }
}
