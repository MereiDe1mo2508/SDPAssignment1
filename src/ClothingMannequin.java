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

    public ClothingMannequin() {
    }

    public void setShirt(String shirt) {
        this.shirt = shirt;
    }
    public void setPants(String pants) {
        this.pants = pants;
    }
    public void setShoes(String shoes) {
        this.shoes = shoes;
    }
    public void setHasHeadAccessory(boolean hasHeadAccessory) {
        this.hasHeadAccessory = hasHeadAccessory;
    }
    public String displayInfo() {
        return "Shirt:" + shirt + "\nPants: " + pants + "\nShoes: " + shoes + "\nHas Head accessory? " + hasHeadAccessory;
    }
}
