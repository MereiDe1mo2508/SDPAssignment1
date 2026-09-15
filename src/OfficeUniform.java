public class OfficeUniform implements ClothingBuilder {
    private ClothingMannequin Office = new ClothingMannequin();
    @Override
    public void createShirt() {
        Office.setShirt("Black blazer and white blouse");
    }
    @Override
    public void createPants() {
        Office.setPants("Black trousers");
    }
    @Override
    public void createShoes() {
        Office.setShoes("Black trench shoes");
    }
    @Override
    public void doesHaveHeadAccessory() {
        Office.setHasHeadAccessory(false);
    }
    @Override
    public ClothingMannequin finishedProduct() {
        return this.Office;
    }
}
