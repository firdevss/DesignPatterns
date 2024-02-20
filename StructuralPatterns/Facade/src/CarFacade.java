public class CarFacade {
    private Engine engine;
    private Lights lights;
    private AirConditioner airConditioner;

    public CarFacade() {
        this.engine = new Engine();
        this.lights = new Lights();
        this.airConditioner = new AirConditioner();
    }

    public void startCar() {
        engine.start();
        lights.turnOn();
        airConditioner.turnOn();
        System.out.println("Car started");
    }

    public void stopCar() {
        engine.stop();
        lights.turnOff();
        airConditioner.turnOff();
        System.out.println("Car stopped");
    }
}
