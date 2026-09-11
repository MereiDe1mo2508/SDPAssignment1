public class MannequinBuilder {
    private String shirt;
    private String pants;
    private String shoes;
    private boolean hasHeadAccessory;
    private MannequinBuilder(Builder builder) {
        this.shirt = builder.shirt;
        this.pants = builder.pants;
        this.shoes = builder.shoes;
        this.hasHeadAccessory = builder.hasHeadAccessory;
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
    public static class Builder {
        private String shirt;
        private String pants;
        private String shoes;
        private boolean hasHeadAccessory = false;
        public Builder setShirt(String shirt) {
            this.shirt = shirt;
            return this;
        }
        public Builder setPants(String pants) {
            this.pants = pants;
            return this;
        }
        public Builder setShoes(String shoes) {
            this.shoes = shoes;
            return this;
        }
        public Builder setHasHeadAccessory() {
            this.hasHeadAccessory = true;
            return this;
        }
        public MannequinBuilder build() {
            return new MannequinBuilder(this);
        }
    }
}
