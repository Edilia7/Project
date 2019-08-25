import java.util.Scanner;

public class Children {
    private Person child;
    private Age age;
    private String childPoint;
    private int points;

    Scanner scan = new Scanner(System.in);

    public Children(){
        this.child = child;
        this.age = age;
    }

    public void AgePoints(){
        System.out.println("Do you have children? y or n: ");
        childPoint = scan.nextLine();
        if(childPoint.equals("y")){
            int point = 0;
            System.out.print("How many children do you have?: ");
            int children = scan.nextInt();
            for(int i = 0; i < children; i++){
                System.out.print("What is your child's age: ");
                int age = scan.nextInt();
                if(age <= 12){
                    point = 4;
                }else if (age >= 12 || age <= 18){
                    point = 2;
                }
                points += point;
            }
        }else{
            points = 0;
        }
        if(points > 8){
            points = 8;
        }
    }

    public String getChild(){
        return childPoint;
    }

    public int getPoints(){

        return points;
    }
}
