import java.util.Scanner;

public class FamilyCanada {
    private String[] relationship = {"Parents", "Son/Daughter", "Wife/Husband", "Grandfather/Grandmother", "Sister/Brother", "Other"};
    private Person family;
    private ContactInformation adress;
    private int points;
    Scanner scan = new Scanner(System.in);

    public FamilyCanada() {
        this.relationship = relationship;
        this.family = family;
        this.adress = adress;
    }

    public void family(){
        int relation = 0;
        System.out.println("Do you have family in Canada y or n: ");
        String answer = scan.nextLine();
        if(answer.equals("y")){
            System.out.println("Please select the corresponding parental number: ");
            for(int i = 0; i<relationship.length; i++){
                System.out.println((i+1) + " " + relationship[i]);
            }
            relation = scan.nextInt();
            points = (relation >= 1 && relation <= 10) ? 3:0;
        }
    }
    public int getPoints(){
        return points;
    }
}
