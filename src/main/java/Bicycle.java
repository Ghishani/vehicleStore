public class Bicycle extends Vehicle implements ILandVehicle {

    private int frameSize;
    private int numberOfWheels;

    public Bicycle(float weight, int maxSpeed, int frameSize){
        super(weight, maxSpeed);
        this.numberOfWheels = 2;
        this.frameSize = frameSize;
    }

    public int getFrameSize() {
        return this.frameSize;
    }

    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }

    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }
}
