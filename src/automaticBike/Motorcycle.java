package automaticBike;

public class Motorcycle {

    private boolean pushButton;
    private int speedometer;

    int gearOneStops = 20;
    int gearTwoStops = 30;
    int gearThreeStops = 40;


    public boolean getButtonState(){
        return pushButton;
    }

    public void turnsOn() {
        String startBike = "START";
        pushButton = startBike.equals("START");
    }

    public void turnsOff() {
        String stopBike = "STOP";
        pushButton = stopBike.equals("PUSH");
    }

    public void accelerates(){
        if (getButtonState() == true) {
            boolean gearShifts_switchToGear2 = speedometer > gearOneStops && speedometer <= gearTwoStops;
            boolean gearShifts_switchToGear3 = speedometer > gearTwoStops && speedometer <= gearThreeStops;
            boolean gearShifts_switchToGear4 = speedometer > gearThreeStops;
            if (gearShifts_switchToGear2) {
                speedometer = speedometer + 2;
            } else if (gearShifts_switchToGear3) {
                speedometer = speedometer + 3;
            } else if (gearShifts_switchToGear4) {
                speedometer = speedometer + 4;
            } else speedometer = speedometer + 1;
        }
    }

    public int getSpeed() {
        return speedometer;
    }

    public void decelerates() {
        if (getButtonState() == true) {
            boolean speedometerNotToBeBelowZero = speedometer > 0;
            boolean gearShifts_switchToGear2 = speedometer > gearOneStops && speedometer <= gearTwoStops;
            boolean gearShifts_switchToGear3 = speedometer > gearTwoStops && speedometer <= gearThreeStops;
            boolean gearShifts_switchToGear4 = speedometer > gearThreeStops;
            if (gearShifts_switchToGear2) {
                speedometer = speedometer - 2;
            } else if (gearShifts_switchToGear3) {
                speedometer = speedometer - 3;
            } else if (gearShifts_switchToGear4) {
                speedometer = speedometer - 4;
            } else if (speedometerNotToBeBelowZero) {
                speedometer = speedometer - 1;
            }
        }
    }

}
