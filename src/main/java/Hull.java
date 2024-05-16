public class Hull implements IWaterVehicle {

    private String hullType;


    public Hull(String hullType){
        this.hullType = hullType;
    }

    public String getHullType(){
        return this.hullType;
    }
    public void setHullType(String typeOfHull){
        this.hullType = typeOfHull;
    }



}
