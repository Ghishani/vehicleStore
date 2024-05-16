public class CargoShip extends Vehicle implements IEngine, IWaterVehicle {

    private int numberOfContainers;
    private IWaterVehicle water;
    private IEngine engine;

    public CargoShip(float weight, int maxSpeed, int numberOfContainers, IWaterVehicle water, IEngine engine){
        super(weight, maxSpeed);
        this.numberOfContainers = numberOfContainers;
        this.water = water;
        this.engine = engine;
    }

    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }




    public String getHullType(){
        return this.water.getHullType();
    }
    public void setHullType(String typeOfHull){
        this.water.setHullType(typeOfHull);
    }



    public IWaterVehicle getWater(){
        return this.water;
    }
    public void setWater(IWaterVehicle water){
        this.water = water;
    }

    public IEngine getEngine(){
        return this.engine;
    }

    public void setEngine(IEngine engine){
        this.engine = engine;
    }




    public int getHorsePower(){
        return this.engine.getHorsePower();
    }

    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }
}
