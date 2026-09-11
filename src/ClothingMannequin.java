public class ClothingMannequin {
    private String shirt;
    private String pants;
    private String shoes;
    private boolean hasHeadAccessory;
    public ClothingMannequin(String shirt, String pants, String shoes, Boolean hasHeadAccessory) {
        this.shirt = shirt;
        this.pants = pants;
        this.shoes = shoes;
        this.hasHeadAccessory = hasHeadAccessory;
    }
    public String getShirt() {
        return shirt;
    }
    public void setShirt(String shirt) {
        this.shirt = shirt;
    }
    public String getPants() {
        return pants;
    }
    public void setPants(String pants) {
        this.pants = pants;
    }
    public String getShoes() {
        return shoes;
    }
    public void setShoes(String shoes) {
        this.shoes = shoes;
    }
    public boolean isHasHeadAccessory() {
        return hasHeadAccessory;
    }
    public void setHasHeadAccessory(boolean hasHeadAccessory) {
        this.hasHeadAccessory = hasHeadAccessory;
    }
}
