public class Runner {

    public static void main(String[] args) {
        IEngine hondaEngine = new CombustionEngine(99, "01/01/2023");
        Car jazz = new Car(1100.0f, 160, "hatchback", hondaEngine);

        System.out.println(jazz.getHorsePower());

        IEngine electricEngine = new ElectricEngine(1000, 100);
        jazz.setEngine(electricEngine);

        System.out.println(jazz.getHorsePower());




        IEngine jaguarEngine = new CombustionEngine(99, "01/01/2023");
        IWaterVehicle displacementHull = new Hull("Displacement");
        CargoShip titanic = new CargoShip(10_000.0f, 20, 500, displacementHull, jaguarEngine);

        System.out.println(titanic.getHullType());






        IEngine boeingEngine = new CombustionEngine(150, "01/01/2023");
        IWaterVehicle fiberglassHull = new Hull("Fiberglass");
        Speedboat mcqueen = new Speedboat(500_000.0f, 1000, true, boeingEngine, fiberglassHull);

        System.out.println(mcqueen.getHullType());




    }


}
