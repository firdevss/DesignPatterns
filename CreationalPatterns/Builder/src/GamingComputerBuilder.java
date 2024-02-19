public class GamingComputerBuilder implements ComputerBuilder{

    private Computer computer;

    public GamingComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildMotherboard() {
        computer.setMotherboard("Gaming Motherboard");
    }

    @Override
    public void buildCPU() {
        computer.setCpu("High-Performance CPU");
    }

    @Override
    public void buildGPU() {
        computer.setGpu("Dedicated Gaming GPU");
    }

    @Override
    public void buildRAM() {
        computer.setRam(16); // 16GB RAM for gaming
    }

    @Override
    public void buildStorage() {
        computer.setStorage(1000); // 1TB SSD for gaming
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
