public class MannequinDirector {
    MannequinBuilder builder;
    public MannequinDirector(MannequinBuilder builder) {
        this.builder = builder;
    }
    public MannequinBuilder createSchoolUniformForBoys() {
        builder
                .setShirt("dark blue blazer")
                .setPants("dark blue trousers")
                .setShoes("black loafer shoes")
                .build();
        return builder.;
    }
    public MannequinBuilder createSchoolUniformForGirls() {
        return new MannequinBuilder.Builder()
                .setShirt("dark blue blazer")
                .setPants("black long skirt")
                .setShoes("black loafer shoes")
                .build();
    }
    public MannequinBuilder createOfficeUniform() {
        return new MannequinBuilder.Builder()
                .setShirt("black corporate shirt")
                .setPants("black trousers")
                .setShoes("black leather shoes")
                .build();
    }
    public MannequinBuilder createAutumnCasual() {
        return new MannequinBuilder.Builder()
                .setShirt("beige leather jacket and brown sweater")
                .setPants("brown cargo trousers")
                .setShoes("brown leather shoes")
                .setHasHeadAccessory()
                .build();
    }
}
