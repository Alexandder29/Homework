package Coding1;

public class Main {
    public static void main(String[] args) {
        Product mouse = new Product(570, "Razer Basilisk", "Up to 16.000 DPI, Wi-Fi or BT connection", 2.0d);

        Cosmetics parfum = new Cosmetics(420, "Paco Rabanne Major Me", "Eau de Parfum",
                1.0, "Red", 0.2d);

        Electronics samsung = new Electronics(2500, "Samsung", "4k resolution", 1,
                "Smart TV", 120, 20, 80, 4.2d);

        Fridge sbs = new Fridge(4700, "Samsung", "635L, clasa D, Twin Cooling Plus",
                1.0, "Side by Side",
                140, 716, 1780, 122.8, 3.0);

        System.out.println("===== Product =====");
        printProduct(mouse);
        System.out.println("===== Cosmetics =====");
        printCosmetics(parfum);
        System.out.println("===== Electronics =====");
        printElectronics(samsung);
        System.out.println("===== Fridge =====");
        printFridge(sbs);
    }

    private static void printProduct(Product product) {
        System.out.println("+++++" + product.getName() + "+++++" + "\nDescription: " + product.getDescription() +
                "\nPrice: " + product.getPrice() + "\nQuantity: " + product.getQuantity());
    }

    private static void printCosmetics(Cosmetics cosmetics) {
        System.out.println("+++++" + cosmetics.getName() + "+++++" + "\nDescription: " + cosmetics.getDescription() +
                "\nColor: " + cosmetics.getColor() + "\nWeight: " + cosmetics.getWeight() + "\nPrice: " + cosmetics.getPrice() + "\nQuantity: " + cosmetics.getQuantity());
    }

    private static void printElectronics(Electronics electronics) {
        System.out.println("+++++" + electronics.getName() + "+++++" + "\nDescription: " + electronics.getDescription() + "\nType: " + electronics.getType() +
                "\nLength, Width, Height, Weight: " + electronics.getLength() + ", " + electronics.getWidth() + ", " + electronics.getHeight() + ", " + electronics.getWeight() +
                "\nPrice: " + electronics.getPrice() +
                "\nQuantity: " + electronics.getQuantity());

    }

    private static void printFridge(Fridge fridge) {
        System.out.println("+++++" + fridge.getName() + "+++++" + "\nDescription: " + fridge.getDescription() + "\nType: " + fridge.getType() +
                "\nTemperature: " + fridge.getTemperature() +
                "\nLength, Width, Height, Weight: " + fridge.getLength() + ", " + fridge.getWidth() + ", " + fridge.getHeight() + ", " + fridge.getWeight() +
                "\nPrice: " + fridge.getPrice() +
                "\nQuantity: " + fridge.getQuantity());
    }

}
