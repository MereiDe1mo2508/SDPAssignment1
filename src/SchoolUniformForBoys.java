public class SchoolUniformForBoys implements ClothingBuilder {
    private ClothingMannequin schoolBoy = new ClothingMannequin();
    @Override
    public void createShirt() {
        schoolBoy.setShirt("Dark blue blazer and white blouse");
    }
    @Override
    public void createPants() {
        schoolBoy.setPants("Dark blue trousers");
    }
    @Override
    public void createShoes() {
        schoolBoy.setShoes("Black or brown loafers");
    }
    @Override
    public void doesHaveHeadAccessory() {
        schoolBoy.setHasHeadAccessory(false);
    }
    @Override
    public ClothingMannequin finishedProduct() {
        return this.schoolBoy;
    }
}
