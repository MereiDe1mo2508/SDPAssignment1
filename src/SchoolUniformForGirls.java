public class SchoolUniformForGirls implements ClothingBuilder {
    private ClothingMannequin schoolGirl = new ClothingMannequin();
    @Override
    public void createShirt() {
        schoolGirl.setShirt("Dark blue blazer and white blouse");
    }
    @Override
    public void createPants() {
        schoolGirl.setPants("Dark blue skirt");
    }
    @Override
    public void createShoes() {
        schoolGirl.setShoes("Black or brown loafers");
    }
    @Override
    public void doesHaveHeadAccessory() {
        schoolGirl.setHasHeadAccessory(false);
    }
    @Override
    public ClothingMannequin finishedProduct() {
        return this.schoolGirl;
    }
}
