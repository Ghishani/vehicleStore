public class Car extends Vehicle implements ILandVehicle, IEngine {

    private String type;
    private int numberOfWheels;
    private IEngine engine;

    public Car(float weight, int maxSpeed, String type, IEngine engine){
        super(weight, maxSpeed);
        this.numberOfWheels = 4;
        this.type = type;
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    //
    public IEngine getEngine(){
        return this.engine;
    }

    public void setEngine(IEngine engine){
        this.engine = engine;
    }

    // capsulation part
    public int getHorsePower(){
        return this.engine.getHorsePower();
    }

    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }
}
