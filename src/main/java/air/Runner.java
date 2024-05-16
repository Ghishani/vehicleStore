package air;

public class Runner {

    public static void main(String[] args) {



        IEngine propellerEngine = new CombustionEngine(500,"16/05/2024");
        IRadar ww2Radar = new RadioRadar(20_000);
        Plane cesna = new Plane(1000.0f, 300, false, 0, propellerEngine, ww2Radar);

        System.out.println(cesna.getHeight());

        cesna.setHeight(5);
        System.out.println(cesna.getHeight());


        System.out.println(cesna.engineStartUp());
    }
}
