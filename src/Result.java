public class Result {

    private int result;
    private int resultMarried;
    private int resultSingle;

    public void getResult(){

        Age age = new Age();
        age.getAge();
        System.out.println();

        EducationLevel level = new EducationLevel();
        level.getEducationLevel();
        System.out.println();

        EducationTraining training = new EducationTraining();
        training.getTraining();
        System.out.println();

        Languages languages = new Languages();
        languages.getNivel();
        System.out.println();

        WorkExperience experience = new WorkExperience();
        experience.getTime();
        System.out.println();

        StayCanada canada = new StayCanada();
        canada.time();
        System.out.println();

        FamilyCanada family = new FamilyCanada();
        family.family();
        System.out.println();

        Children children = new Children();
        children.AgePoints();
        System.out.println();

        CivilStatus married = new CivilStatus();
        married.Status();
        System.out.println();

        if(married.getStatus() == 1 || married.getStatus() == 2){
            System.out.println("Please enter your partner's information");
            Age ageMarried = new Age();
            ageMarried.getAgeMarried();
            System.out.println();

            EducationLevel levelMarried = new EducationLevel();
            levelMarried.getLevelMarried();
            System.out.println();

            EducationTraining trainingMarried = new EducationTraining();
            trainingMarried.getTrainingMarried();
            System.out.println();

            Languages languagesMarried = new Languages();
            languagesMarried.getNivelMarried();
            System.out.println();
        }

        result = age.getPoints() + level.getPoint() + training.getPoint() + languages.getPoints() + experience.getPoints() + canada.getPoints() + family.getPoints() + children.getPoints();
        resultMarried = result - 59;
        resultSingle = result - 50;

        System.out.println("----------------------------------");
        System.out.println("Thanks for answering the questions\n" +
                "Your score is: " + result);
        if((married.getStatus() == 1 || married.getStatus() == 2) && resultMarried >= 0){
            System.out.println("You have enough points to be selected, please create your account");
        }else if((married.getStatus() == 1 || married.getStatus() == 2) && resultMarried < 0){
            System.out.println("Sorry, you do not have the necessary points to be selected");
        }else if(married.getStatus() > 2 && resultSingle >= 0){
            System.out.println("You have enough points to be selected, please create your account");
        }else if(married.getStatus() > 2 && resultSingle < 0){
            System.out.println("Sorry, you do not have the necessary points to be selected");
        }
    }
}
