package airConditioner;

public class AirConditioner {

    private int powerButton;
    private int temperature;

    public boolean getPowerState(){
        if (powerButton == 1) return true;
        else return false;
    }
    public void switchOn(){
        powerButton = 1;
        temperature = 20;
    }

    public void switchOff(){
        powerButton = 0;
    }

    public int getTemperature(){
        return temperature;
    }

    public void setTemperatureToHigh(){

        boolean temperatureShouldNotGoAboveThirty = temperature < 30;
        if (getPowerState() == true)
            if (temperatureShouldNotGoAboveThirty) temperature = temperature + 1;
    }

    public void setTemperatureToLow(){
        boolean temperatureShouldNotGoBelowSixteen = temperature > 16;
        if (getPowerState() == true)
            if (temperatureShouldNotGoBelowSixteen) temperature = temperature - 1;
    }
}
