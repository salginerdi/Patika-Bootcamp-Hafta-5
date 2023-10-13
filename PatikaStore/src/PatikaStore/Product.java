package PatikaStore;

public class Product {
    private int id;
    private String productName;
    private double unitPrice;
    private double discountRate;
    private int stock;
    private String brand;

    public Product(int id, String productName, double unitPrice, double discountRate, int stock, String brand) {
        this.id = id;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stock = stock;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int getStock() {
        return stock;
    }

    public String getBrand() {
        return brand;
    }
}