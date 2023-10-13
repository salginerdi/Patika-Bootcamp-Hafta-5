package PatikaStore;

public class Notebook extends Product {
    private int storage;
    private double screenSize;
    private int ram;

    public Notebook(int id, String productName, double unitPrice, double discountRate, int stock, String brand,
                    int storage, double screenSize, int ram) {
        super(id, productName, unitPrice, discountRate, stock, brand);
        this.storage = storage;
        this.screenSize = screenSize;
        this.ram = ram;
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
}