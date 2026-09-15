public class AutumnCasual implements ClothingBuilder {
    private ClothingMannequin Autumn = new ClothingMannequin();
    @Override
    public void createShirt() {
        Autumn.setShirt("Beige coat and black sweater");
    }
    @Override
    public void createPants() {
        Autumn.setPants("Brown cargo jeans");
    }
    @Override
    public void createShoes() {
        Autumn.setShoes("Black trench shoes");
    }
    @Override
    public void doesHaveHeadAccessory() {
        Autumn.setHasHeadAccessory(true);
    }

    @Override
    public ClothingMannequin finishedProduct() {
        return this.Autumn;
    }
}
