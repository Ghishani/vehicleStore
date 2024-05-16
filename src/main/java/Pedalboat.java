public class Pedalboat extends Vehicle implements IWaterVehicle {


    private int numberOfSeats;
    private IWaterVehicle water;

    public Pedalboat(float weight, int maxSpeed, int numberOfSeats,IWaterVehicle water){
        super(weight, maxSpeed);
        this.numberOfSeats = numberOfSeats;
        this.water = water;



    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getHullType(){
        return this.water.getHullType();
    }
    public void setHullType(String typeOfHull){
        this.water.setHullType(typeOfHull);
    }










}
