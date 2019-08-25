import java.util.Scanner;

public class EducationTraining {

    private String[] trainingArea = {"IT", "Nurse", "Banking Area", "Engineer", "Other"};
    private int point;
    private int pointMarried;
    private String courseName;
    private String university;
    private String startDate;
    private String finalDate;
    private String city;
    private String country;
    Scanner scan = new Scanner(System.in);

    public EducationTraining(String[] trainingArea) {
        this.trainingArea = trainingArea;
    }

    public EducationTraining() {
        this.courseName = courseName;
        this.university = university;
        this.startDate = startDate;
        this.finalDate = finalDate;
        this.city = city;
        this.country = country;
        this.scan = scan;
    }

    public void getTraining() {
        System.out.println("please select the number corresponding to your training area: ");
        for(int i = 0; i < trainingArea.length; i++){
            System.out.println((i+1) + ". " + trainingArea[i]);
        }
        int training = scan.nextInt();

        switch(training){
            case 1: {
                point = 12;
                break;
            }
            case 2: {
                point = 10;
                break;
            }
            case 3: {
                point = 8;
                break;
            }
            case 4: {
                point = 6;
                break;
            }
            case 5: {
                point = 0;
                break;
            }
        }
    }

    public void getTrainingMarried(){
        System.out.println("please select the number corresponding to your training area: ");
        for(int i = 0; i < trainingArea.length; i++){
            System.out.println((i+1) + ". " + trainingArea[i]);
        }
        int trainingMarried = scan.nextInt();

        switch(trainingMarried){
            case 1: {
                point = 4;
                break;
            }
            case 2: {
                point = 3;
                break;
            }
            case 3: {
                point = 2;
                break;
            }
            case 4: {
                point = 1;
                break;
            }
            case 5: {
                point = 0;
                break;
            }
        }
    }

    public int getPointMarried(){
        return pointMarried;
    }

    public int getPoint() {
        return point;
    }
}
