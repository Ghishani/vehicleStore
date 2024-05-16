public class Speedboat extends Vehicle implements IEngine, IWaterVehicle {

    private boolean needsCrew;

    private IWaterVehicle water;
    private IEngine engine;

    public Speedboat(float weight, int maxSpeed, boolean needsCrew, IEngine engine, IWaterVehicle water){
        super(weight, maxSpeed);
        this.needsCrew = needsCrew;
        this.engine = engine;
        this.water = water;
    }

    public boolean getNeedsCrew() {
        return needsCrew;
    }

    public void setNeedsCrew(boolean needsCrew) {
        this.needsCrew = needsCrew;
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
