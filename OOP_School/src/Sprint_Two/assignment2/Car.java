package assignment2;

public class Car {
    private double meeterStart;
    private double meeterCurrent;
    private double consumedFuel;

    public Car(double meeterStart, double meeterCurrent, double consumedFuel) {
        this.meeterStart = meeterStart;
        this.meeterCurrent = meeterCurrent;
        this.consumedFuel = consumedFuel;
    }

    public double getDrivenMiles(){
        return meeterCurrent - meeterStart;
    }

    public double getAvarageConsumption() {
        return this.consumedFuel / (this.getMeeterCurrent() - this.getMeeterStart());
    }

    public double getMeeterStart() {
        return meeterStart;
    }

    public void setMeeterStart(double meeterStart) {
        this.meeterStart = meeterStart;
    }

    public double getMeeterCurrent() {
        return meeterCurrent;
    }

    public void setMeeterCurrent(double meeterCurrent) {
        this.meeterCurrent = meeterCurrent;
    }

    public double getConsumedFuel() {
        return consumedFuel;
    }

    public void setConsumedFuel(double consumedFuel) {
        this.consumedFuel = consumedFuel;
    }
}
