package PatikaStore;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Brand> brands;
    private List<Product> products;

    public ProductManager() {
        brands = new ArrayList<>();
        products = new ArrayList<>();
    }

    public void addBrand(int id, String name) {
        brands.add(new Brand(id, name));
    }

    public void listBrands() {
        System.out.println("Markalarımız");
        System.out.println("--------------");
        for (Brand brand : brands) {
            System.out.println("- " + brand.getName());
        }
    }

    public void addProduct(int id, String productName, double unitPrice, double discountRate, int stock, String brand) {
        products.add(new Product(id, productName, unitPrice, discountRate, stock, brand));
    }

    public void addNotebook(int id, String productName, double unitPrice, double discountRate, int stock, String brand, int storage, double screenSize, int ram) {
        products.add(new Notebook(id, productName, unitPrice, discountRate, stock, brand, storage, screenSize, ram));
    }

    public void addMobilePhone(int id, String productName, double unitPrice, double discountRate, int stock, String brand, int storage, double screenSize, int ram, String color, int camera, double battery) {
        products.add(new MobilePhone(id, productName, unitPrice, discountRate, stock, brand, storage, screenSize, ram, color, camera, battery));
    }

    public void listProducts(String category) {
        System.out.println(category + " Listesi");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |%n");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Product product : products) {
            if (category.equals("Cep Telefonları") && product instanceof MobilePhone) {
                System.out.printf("| %d  | %s | %.1f TL | %s | %d GB | %.1f Inc | %d MB |%n", product.getId(), product.getProductName(),
                        product.getUnitPrice(), product.getBrand(), ((MobilePhone) product).getStorage(), ((MobilePhone) product).getScreenSize(),
                        ((MobilePhone) product).getRam());
            } else if (category.equals("Notebook") && product instanceof Notebook) {
                System.out.printf("| %d  | %s | %.1f TL | %s | %d GB | %.1f Inc | %d MB |%n", product.getId(), product.getProductName(),
                        product.getUnitPrice(), product.getBrand(), ((Notebook) product).getStorage(), ((Notebook) product).getScreenSize(),
                        ((Notebook) product).getRam());
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public void deleteProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                break;
            }
        }
    }

    public void filterProductsByBrand(String category, String brand) {
        System.out.println(category + " Listesi (Filtrelenmiş)");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| ID | Ürün Adı | Fiyat | Marka | Depolama | Ekran | RAM |\n");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Product product : products) {
            if (product.getBrand().equals(brand)) {
                if (category.equals("Cep Telefonları") && product instanceof MobilePhone) {
                    System.out.printf("| %d  | %s | %.1f TL | %s | %d GB | %.1f Inc | %d MB |%n", product.getId(), product.getProductName(),
                            product.getUnitPrice(), product.getBrand(), ((MobilePhone) product).getStorage(), ((MobilePhone) product).getScreenSize(),
                            ((MobilePhone) product).getRam());
                } else if (category.equals("Notebook") && product instanceof Notebook) {
                    System.out.printf("| %d  | %s | %.1f TL | %s | %d GB | %.1f Inc | %d MB |%n", product.getId(), product.getProductName(),
                            product.getUnitPrice(), product.getBrand(), ((Notebook) product).getStorage(), ((Notebook) product).getScreenSize(),
                            ((Notebook) product).getRam());
                }
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
}
