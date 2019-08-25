import java.util.Scanner;

public class JobOffert {

    private String companyName;
    private String position;
    private ContactInformation adress;
    private int points;
    Scanner scan = new Scanner(System.in);

    public JobOffert(){
    }

    public void points(){
        System.out.println("Do you have a job offert? y or n: ");
        String offert = scan.nextLine();
        if(offert.equals("y")){
            points = 8;
        }
    }

    public int getPoints(){
        return points;
    }
}
