package PatikaStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Çıkış yapılıyor...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("1 - Notebook Listele");
                    System.out.println("2 - Notebook Ekle");
                    System.out.println("3 - Notebook Sil");
                    System.out.println("4 - Markaya Göre Notebook Listele");
                    System.out.print("Tercihiniz: ");
                    int notebookChoice = scanner.nextInt();
                    if (notebookChoice == 1) {
                        productManager.listProducts("Notebook");
                    } else if (notebookChoice == 2) {
                        System.out.print("Ürün Adı: ");
                        String productName = scanner.next();
                        System.out.print("Birim Fiyatı: ");
                        double unitPrice = scanner.nextDouble();
                        System.out.print("İndirim Oranı: ");
                        double discountRate = scanner.nextDouble();
                        System.out.print("Stok Miktarı: ");
                        int stock = scanner.nextInt();
                        System.out.print("Marka Adı: ");
                        String brand = scanner.next();
                        System.out.print("RAM (GB): ");
                        int ram = scanner.nextInt();
                        System.out.print("Depolama (SSD GB): ");
                        int storage = scanner.nextInt();
                        System.out.print("Ekran Boyutu (Inç): ");
                        double screenSize = scanner.nextDouble();

                        productManager.addNotebook(1, productName, unitPrice, discountRate, stock, brand, storage, screenSize, ram);
                        System.out.println("Notebook başarıyla eklendi.");
                    } else if (notebookChoice == 3) {
                        System.out.print("Silmek istediğiniz ürünün ID'sini girin: ");
                        int productId = scanner.nextInt();
                        productManager.deleteProduct(productId);
                        System.out.println("Ürün başarıyla silindi.");
                    } else if (notebookChoice == 4) {
                        System.out.print("Marka adı: ");
                        String brand = scanner.next();
                        productManager.filterProductsByBrand("Notebook", brand);
                    } else {
                        System.out.println("Geçersiz seçenek!");
                    }
                    break;
                case 2:
                    System.out.println("1 - Cep Telefonu Listele");
                    System.out.println("2 - Cep Telefonu Ekle");
                    System.out.println("3 - Cep Telefonu Sil");
                    System.out.println("4 - Markaya Göre Cep Telefonu Listele");
                    System.out.print("Tercihiniz: ");
                    int mobilePhoneChoice = scanner.nextInt();
                    if (mobilePhoneChoice == 1) {
                        productManager.listProducts("Cep Telefonları");
                    } else if (mobilePhoneChoice == 2) {
                        System.out.print("Ürün Adı: ");
                        String productName = scanner.next();
                        System.out.print("Birim Fiyatı: ");
                        double unitPrice = scanner.nextDouble();
                        System.out.print("İndirim Oranı: ");
                        double discountRate = scanner.nextDouble();
                        System.out.print("Stok Miktarı: ");
                        int stock = scanner.nextInt();
                        System.out.print("Marka Adı: ");
                        String brand = scanner.next();
                        System.out.print("Depolama (GB): ");
                        int storage = scanner.nextInt();
                        System.out.print("Ekran Boyutu (Inç): ");
                        double screenSize = scanner.nextDouble();
                        System.out.print("RAM (MB): ");
                        int ram = scanner.nextInt();
                        System.out.print("Renk: ");
                        String color = scanner.next();
                        System.out.print("Kamera: ");
                        int camera = scanner.nextInt();
                        System.out.print("Pil Gücü: ");
                        double battery = scanner.nextDouble();

                        productManager.addMobilePhone(2, productName, unitPrice, discountRate, stock, brand, storage, screenSize, ram, color, camera, battery);
                        System.out.println("Cep telefonu başarıyla eklendi.");
                    } else if (mobilePhoneChoice == 3) {
                        System.out.print("Silmek istediğiniz ürünün ID'sini girin: ");
                        int productId = scanner.nextInt();
                        productManager.deleteProduct(productId);
                        System.out.println("Ürün başarıyla silindi.");
                    } else if (mobilePhoneChoice == 4) {
                        System.out.print("Marka adı: ");
                        String brand = scanner.next();
                        productManager.filterProductsByBrand("Cep Telefonları", brand);
                    } else {
                        System.out.println("Geçersiz seçenek!");
                    }
                    break;
                case 3:
                    Brand.printBrands();
                    break;
                default:
                    System.out.println("Geçersiz seçenek!");
                    break;
            }
        }
    }
}
