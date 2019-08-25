import java.util.Scanner;

public class Age {
    private String bornDate;
    private int age;
    private int ageMarried;
    private int points;
    private int pointsMarried;
    Scanner scan = new Scanner(System.in);

    public Age(){
        this.age = age;
    }

    public void getAge(){
        System.out.println("please enter your age: ");
        age = scan.nextInt();
        if(age >= 18 && age <= 35){
            points = 16;
        }else if(age == 36){
            points = 14;
        }else if(age == 37){
            points = 12;
        }else if(age == 38){
            points = 10;
        }else if(age == 39){
            points = 8;
        }else if(age == 40){
            points = 6;
        }else if(age == 41){
            points = 4;
        }else if(age == 42){
            points = 2;
        }else if(age >= 43){
            points = 0;
        }else{
            System.out.println("If you are under 18 years old you can not apply");
            System.exit(0);
        }
    }

    public void getAgeMarried(){
        System.out.println("please enter your age: ");
        ageMarried = scan.nextInt();
        if(ageMarried >= 18 && ageMarried <= 35){
            pointsMarried = 3;
        }else if(ageMarried >= 36 && ageMarried <= 39){
            pointsMarried = 2;
        }else if(ageMarried >= 40 && ageMarried <= 42){
            pointsMarried = 1;
        }else if(age >= 43){
            pointsMarried = 0;
        }
    }

    public int getPointsMarried(){
        return pointsMarried;
    }

    public int getPoints(){
        return points;
    }
}
