public class Shoes {
    
    public String brand;
    public String model;
    public String type;   // e.g., Running, Casual, Basketball
    public double price;  

    // Constructor
    public Shoes(String brand, String model, String type, double price) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
    }

    // Getters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getType() { return type; }
    public double getPrice() { return price; }

    // Setters
    public void setType(String type) { this.type = type; }
    public void setPrice(double price) { this.price = price; }

    // Display method
    public void displayShoesDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Price: P " + String.format("%,.2f", price));
        System.out.println();
    }
}
