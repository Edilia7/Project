import java.util.Scanner;
public class EducationLevel {

    private String[] level = {"No studies", "High school", "One year program", "Two year program", "Bachelor Degree", "Master", "Doctoral level"};
    private int point;
    private int pointMarried;
    Scanner scan = new Scanner(System.in);

    public EducationLevel() {
        this.point = point;
    }

    public void getEducationLevel() {
        System.out.println("please select the number corresponding to your level of studies: ");
        for(int i = 0; i < level.length; i++){
            System.out.println((i) + ". " + level[i]);
        }
        int education = scan.nextInt();

        switch(education){
            case 0: {
                System.out.println("Without studies you cannot apply");
                System.exit(0);
            }
            case 1: {
                point = 2;
                break;
            }
            case 2: {
                point = 6;
                break;
            }
            case 3: {
                point = 8;
                break;
            }
            case 4: {
                point = 10;
                break;
            }
            case 5: {
                point = 12;
                break;
            }
            case 6: {
                point = 14;
                break;
            }
        }
    }

    public void getLevelMarried(){
        System.out.println("please select the number corresponding to your level of studies: ");
        for(int i = 0; i < level.length; i++){
            System.out.println((i) + ". " + level[i]);
        }
        int education = scan.nextInt();

        if(education == 0){
            pointMarried = 0;
        }else if(education == 1){
            pointMarried = 1;
        }else if(education == 2 || education == 3){
            pointMarried = 2;
        }else if(education == 4){
            pointMarried = 3;
        }else if(education == 5 || education == 6){
            pointMarried = 4;
        }
    }

    public int getPointMarried(){
        return pointMarried;
    }

    public int getPoint() {
        return point;
    }
}
