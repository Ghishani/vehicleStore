public class Bus extends Vehicle implements ILandVehicle, IEngine {

    private boolean isDoubleDecker;
    private int numberOfWheels;
    private IEngine engine;

    public Bus(float weight, int maxSpeed, int horsePower, boolean isDoubleDecker, IEngine engine){
        super(weight, maxSpeed);
        this.numberOfWheels = 8;
        this.isDoubleDecker = isDoubleDecker;
        this.engine = engine;
    }

    public boolean getIsDoubleDecker() {
        return isDoubleDecker;
    }

    public void setDoubleDecker(boolean doubleDecker) {
        isDoubleDecker = doubleDecker;
    }

    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
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
