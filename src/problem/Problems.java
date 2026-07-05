package problem;

import person.ProblemType;

public class Problems {

    private String problemName;

    private ProblemType problemType;

    private boolean isProblemSolved;

    public Problems(String problemName, ProblemType problemType){
        this.problemName = problemName;
        this.problemType = problemType;
        isProblemSolved = false;
    }


}
