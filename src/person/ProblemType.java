package person;

public enum ProblemType {

    FINANCIAL("MONEY"),
    SPIRITUAL("PRAYER"),
    BUSINESS("IDEA"),
    TECHNICAL("DEVICE"),
    EDUCATION("SCHOOL");

    private String type;
    ProblemType(String type){
        this.type = type;
    }

}
