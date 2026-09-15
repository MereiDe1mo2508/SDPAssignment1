public class Main {
    public static void main(String[] args) {
        MannequinDirector director = new MannequinDirector();
        // The director class
        ClothingMannequin mannequin1 = new ClothingMannequin("hoodie", "jeans", "boots", true);
        // The default/product class
        MannequinBuilder mannequin2 = new MannequinBuilder.Builder()
                .setShirt("jacket")
                .setPants("shorts")
                .setShoes("crocs")
                .setHasHeadAccessory()
                .build();
        // The builder class
        ClothingBuilder clothingMaker = new CasualPicnic();
        // Builder interface with Concrete class #1
        director.createCasualClothing(clothingMaker);
        // Constructing that Concrete class
        ClothingMannequin casualClothing = clothingMaker.finishedProduct();
        // Getting finished product of clothing
        ClothingBuilder schoolUniformMaker = new SchoolUniformForBoys();
        // Builder interface with Concrete class #2
        director.createSchoolUniform(schoolUniformMaker);
        // Constructing another Concrete class
        ClothingMannequin school = schoolUniformMaker.finishedProduct();
        // Getting another finished product of clothing
        System.out.println(mannequin1.displayInfo());
        System.out.println(mannequin2.getShirt() + " " + mannequin2.getPants() + " " + mannequin2.getShoes() + " " + mannequin2.isHasHeadAccessory());
        System.out.println("Finished Product: " + casualClothing);
        System.out.println("Finished Product: " + school);
    }
}