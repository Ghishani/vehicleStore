package air;

public class Plane extends Vehicle implements IEngine, IRadar, IFly {

    private boolean isJetEngine;
    private IEngine engine;
    private int noOfFirstClassSeats;
    private IRadar radar;


    public Plane(float weight, int maxspeed, boolean isJetEngine, int noOfFirstClassSeats, IEngine engine, IRadar radar){
        super(weight, maxspeed);
        this.isJetEngine = isJetEngine;
        this.engine = engine;
        this.noOfFirstClassSeats = noOfFirstClassSeats;
        this.radar = radar;
    }

    public int getNoOfFirstClassSeats(){
        return this.noOfFirstClassSeats;
    }

    public void setNoOfFirstClassSeats(int seats){
        this.noOfFirstClassSeats = seats;
    }

    public boolean getIsJetEngine(){
        return this.isJetEngine;
    }
    public void setIsJetEngine(boolean jetEngine){
        this.isJetEngine = jetEngine;
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



    public int getHeight(){
        return this.radar.getHeight();
    }

    public void setHeight(int height){
        this.radar.setHeight(height);
    }



    public IRadar getRadar(){
        return this.radar;
    }
    public void setRadar(IRadar radar){
        this.radar = radar;
    }

    public String engineStartUp(){
        return "Plane takes off the runway";
    }

}
