public class CasualPicnic implements ClothingBuilder {
    private ClothingMannequin casual = new ClothingMannequin();
    @Override
    public void createShirt() {
        casual.setShirt("Red&Black flannel and white t-shirt");
    }
    @Override
    public void createPants() {
        casual.setPants("Dark blue jeans");
    }
    @Override
    public void createShoes() {
        casual.setShoes("White sneakers");
    }
    @Override
    public void doesHaveHeadAccessory() {
        casual.setHasHeadAccessory(true);
    }
    @Override
    public ClothingMannequin finishedProduct() {
        return this.casual;
    }
}
