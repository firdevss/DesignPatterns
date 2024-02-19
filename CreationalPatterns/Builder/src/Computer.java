public class Computer {
    private String motherboard;
    private String cpu;
    private String gpu;
    private int ram;
    private int storage;

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "motherboard='" + motherboard + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram=" + ram +
                "GB, storage=" + storage +
                "GB}";
    }

}
