public class Kayak extends Vehicle implements IWaterVehicle{

    private int numberOfPaddles;
    private IWaterVehicle water;

    public Kayak(float weight, int maxSpeed,IWaterVehicle water){
        super(weight, maxSpeed);
        this.numberOfPaddles = 1;
        this.water = water;



    }

    public int getNumberOfPaddles() {
        return numberOfPaddles;
    }

    public void setNumberOfPaddles(int numberOfPaddles) {
        this.numberOfPaddles = numberOfPaddles;
    }


    public String getHullType(){
        return this.water.getHullType();
    }
    public void setHullType(String typeOfHull){
        this.water.setHullType(typeOfHull);
    }



//    public IWaterVehicle getWater(){
//        return this.water;
//    }
//    public void setWater(IWaterVehicle water){
//        this.water = water;
//    }




}
