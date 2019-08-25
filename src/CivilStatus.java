import java.util.Scanner;

public class CivilStatus {

    private String[] civilStatus = {"Common-Law", "Married", "Single", "Legally Separated", "Divorced", "Widowed"};
    private int status;
    Scanner scan = new Scanner(System.in);

    public CivilStatus(){
        this.civilStatus = civilStatus;
    }

    public void Status(){
        System.out.println("please select the number corresponding to your civil status: ");
        for(int i = 0; i < civilStatus.length; i++){
            System.out.println((i+1) + ". " + civilStatus[i]);
        }
        status = scan.nextInt();
    }

    public int getStatus(){
        return status;
    }
}
