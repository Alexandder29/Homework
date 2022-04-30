package Coding1;

public class Electronics extends Product {
    private String type;
    private int length;
    private int width;
    private int height;
    private double weight;

    public Electronics(int price, String name, String description, double quantity, String type, int length, int width, int height, double weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;  //mm
        this.width = width; //mm
        this.height = height; //mm
        this.weight = weight; //kg
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

}
