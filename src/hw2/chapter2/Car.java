package hw2.chapter2;

public class Car {

    private double coordinateX = 0 ;
    private double fuelСonsumption;
    private double fuelLevel;

    public Car(double coordinateX,double fuelСonsumption,double fuelLevel) {
        this.coordinateX=coordinateX;
        this.fuelСonsumption = fuelСonsumption;
        this.fuelLevel = fuelLevel;
    }

    public void drive(double distance){
        if(fuelLevel>=distance/fuelСonsumption){
            this.coordinateX+=distance;
            fuelLevel-=distance/fuelСonsumption;
        }
        else{
            System.out.println("Not enough fuel");
        }
    }
    public void refueling(double fuel){
        this.fuelLevel+=fuel;
    }

    public double getCurrentDistance(){
        return Math.abs(this.coordinateX);
    }
    public double maxDistance() {
        return fuelLevel * fuelСonsumption;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "coordinateX=" + coordinateX +
                ", fuelСonsumption=" + fuelСonsumption +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}
