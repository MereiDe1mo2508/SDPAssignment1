public class Main {
    public static void main(String[] args) {
        ClothingMannequin mannequin1 = new ClothingMannequin("hoodie", "jeans", "boots", true);
        // ^^ The default/product class
        MannequinBuilder mannequin2 = new MannequinBuilder.Builder()
                .setShirt("jacket")
                .setPants("shorts")
                .setShoes("crocs")
                .setHasHeadAccessory()
                .build(); // The builder class
        // The director class
        System.out.println(mannequin1.displayInfo());
        System.out.println(mannequin2.getShirt() + " " + mannequin2.getPants() + " " + mannequin2.getShoes() + " " + mannequin2.isHasHeadAccessory());
    }
}