package PatikaStore;

public class MobilePhone extends Product {
    private int storage;
    private double screenSize;
    private int ram;
    private String color;
    private int camera;
    private double battery;

    public MobilePhone(int id, String productName, double unitPrice, double discountRate, int stock, String brand,
                       int storage, double screenSize, int ram, String color, int camera, double battery) {
        super(id, productName, unitPrice, discountRate, stock, brand);
        this.storage = storage;
        this.screenSize = screenSize;
        this.ram = ram;
        this.color = color;
        this.camera = camera;
        this.battery = battery;
    }

    public int getStorage() {
        return storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public int getCamera() {
        return camera;
    }

    public double getBattery() {
        return battery;
    }
}

