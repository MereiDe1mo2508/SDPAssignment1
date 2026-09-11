public class Main {
    public static void main(String[] args) {
        ClothingMannequin mannequin1 = new ClothingMannequin("hoodie", "jeans", "boots", true);
        MannequinBuilder mannequin2 = new MannequinBuilder.Builder()
                .setShirt("jacket")
                .setPants("shorts")
                .setShoes("crocs")
                .setHasHeadAccessory()
                .build();
        System.out.println(mannequin1.getShirt() + " " + mannequin1.getPants() + " " + mannequin1.getShoes());
        System.out.println(mannequin2.getShirt() + " " + mannequin2.getPants() + " " + mannequin2.getShoes() + " " + mannequin2.isHasHeadAccessory());
    }
}