package person;

public class Nigerian {

    String name;
    GeoPoliticalZone stateOfOrigin;
    Gender gender;
    double weightInKG;
    int heightInCM;
    int age;

    public Nigerian(String name, String stateOfOrigin, String gender, double weightInKG, int heightInCM, int age){

        this.name = name;
        this.stateOfOrigin = validateState(stateOfOrigin);

        validatedGender(gender);
        this.gender = Gender.valueOf(gender.toUpperCase());

        validateAgeWeightHeight(age, weightInKG, heightInCM);
        this.weightInKG = weightInKG;
        this.heightInCM = heightInCM;
        this.age = age;
    }

    public Nigerian(String name, String stateOfOrigin, String gender){
        this(name, stateOfOrigin, gender, 60.0, 189, 22);
    }

    private void validateAgeWeightHeight(int age, double weightInLBS, int heightInCM){
        validateAge(age);
        validateWeight(weightInLBS);
        validateHeight(heightInCM);
    }

    private void validateWeight(double weightInKG) {
        boolean weightIsNotMet = weightInKG < 0.2 || weightInKG > 690;
        if(weightIsNotMet)
            throw new IllegalArgumentException("Error!! You Be Human Being So?");
    }

    private void validateHeight(int heightInCM) {
        boolean heightIsNotMet = heightInCM < 23 || heightInCM > 272;
        if(heightIsNotMet)
            throw new IllegalArgumentException("Abort!! No one is that height you Liar");
    }

    private void validateAge(int age){
        boolean ageIsNotMet = age < 0 || age > 170;
        String errorMessage = String.format("You cannot Possible be %d Years old", age);
        if(ageIsNotMet)
            throw new IllegalArgumentException(errorMessage);
    }

    private boolean stateDoesNotExist(String stateOfOrigin){
        int count = 0;
        GeoPoliticalZone [] states = GeoPoliticalZone.values();
        String stateOfOriginToUpperCase = stateOfOrigin.toUpperCase();
        for(GeoPoliticalZone state : states){
            if(stateOfOriginToUpperCase.equals(state.name()))
                count++;
        }
        return count == 0;
    }
    private void checkStateOrigin(String stateOfOrigin){
        boolean stateDoesNotExist = stateDoesNotExist(stateOfOrigin);
        if(stateDoesNotExist) throw new IllegalArgumentException("Unavailable!");
    }

    private GeoPoliticalZone validateState(String stateOfOrigin){
        String stateOfOriginToUpperCase = stateOfOrigin.toUpperCase();
        boolean userInputsAbuja = stateOfOriginToUpperCase.equals("ABUJA");

        if(userInputsAbuja)
            return GeoPoliticalZone.valueOf("FCT");
        else{
            checkStateOrigin(stateOfOrigin);
            return GeoPoliticalZone.valueOf(stateOfOriginToUpperCase);
        }
    }

    private boolean isNotMaleOrFemale(String gender){
        Gender [] persons = Gender.values();
        String genderChoiceToUpperCase = gender.toUpperCase();
        int count = 0;

        for(Gender person : persons){
            if(genderChoiceToUpperCase.equals(person.name()))
                count++;
        }

        return count == 0;
    }

    private void validatedGender(String gender){
        if(isNotMaleOrFemale(gender))
            throw new IllegalArgumentException("Hmmm..... why are you gae?");
    }

    public String getGeoZone() {
        return stateOfOrigin.getZone();
    }
}
