package linearRegression;

public class LinearRegression {
    private double [] x;
    private double [] y;
    private double meanForX;
    private double meanForY;
    private double slope;
    private double intercept;

    public void setAxisXValues(double [] value){
        this.x = value;
    }

    public void setAxisYValues(double [] value) {
        this.y = value;
    }

    public boolean isAxisEmpty(){
        return x.length == 0 && y.length == 0;
    }

    public void calculateMeanX() {
        double total = 0;

        for(double element : this.x){
             total += element;
        }
        meanForX = total/this.x.length;
    }

    public void calculateMeanY() {
        double total = 0;

        for(double element : this.y){
            total += element;
        }
        meanForY = total/this.y.length;
    }

    public double getMeanForX(){
        return meanForX;
    }

    public double getMeanForY(){
        return meanForY;
    }

    public double  calculateNumerator(){
        double total = 0;
        for (int count= 0; count < this.x.length; count++){
            total += (this.x[count] - this.meanForX) * (this.y[count] - this.meanForY);
        }
        return total;
    }

    public double calculateDenominator(){
        double total = 0;
        for (double element : this.x){
            total += Math.pow((element - this.meanForX), 2);
        }
        return total;
    }

    public void setTheSlope(){
        double numerator = calculateNumerator();
        double denominator = calculateDenominator();

        slope = numerator/denominator;
    }

    public double getSlope() {
        return slope;
    }

    public void checkIntercept(){
        intercept = meanForY - (slope * meanForX);
    }

    public double getIntercept(){
        return intercept;
    }

    public double predictedOutcome(int number){
        double total = (slope * number) + intercept;
        return total;
    }

}
