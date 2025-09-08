public class Shoestester {
    public static void main(String[] args) {
        // Create 4 shoe objects
        Shoes shoe1 = new Shoes("Nike", "Air Jordan 1", "Basketball", 8.995);
        Shoes shoe2 = new Shoes("Adidas", "Ultraboost 22", "Running", 10.500);
        Shoes shoe3 = new Shoes("Converse", "Chuck Taylor All Star", "Casual", 3.250);
        Shoes shoe4 = new Shoes("Puma", "RS-X", "Lifestyle", 6.800);

        // Display details of all shoes
        shoe1.displayShoesDetails();
        shoe2.displayShoesDetails();
        shoe3.displayShoesDetails();
        shoe4.displayShoesDetails();
    }
}
