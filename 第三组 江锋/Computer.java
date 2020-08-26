public class Computer {
    private String serialNumber;
    private double price;
    private ComputerSpec spec;

    public Computer(String serialNumber, double price, ComputerSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ComputerSpec getSpec() {
        return spec;
    }
}

