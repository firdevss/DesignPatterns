public class Technician {
    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer() {
        return computerBuilder.getComputer();}

    public void constructComputer() {
        computerBuilder.buildMotherboard();
        computerBuilder.buildCPU();
        computerBuilder.buildGPU();
        computerBuilder.buildRAM();
        computerBuilder.buildStorage();
    }
}
