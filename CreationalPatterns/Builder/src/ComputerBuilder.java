public interface ComputerBuilder {
    void buildMotherboard();
    void buildCPU();
    void buildGPU();
    void buildRAM();
    void buildStorage();
    Computer getComputer();
}
