package air;

public class RadioRadar implements IRadar{

    private int height;

    public RadioRadar(int height){
        this.height = height;
    }


    public int getHeight(){
        return this.height;
    }
    public void setHeight(int height){
        this.height = height;
    }

}
