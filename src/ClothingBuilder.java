public interface ClothingBuilder {
    void createShirt();
    void createPants();
    void createShoes();
    void doesHaveHeadAccessory();
    ClothingMannequin finishedProduct();
}
// The interface was created because it's almost impossible to create director class using builder class (+it will be as bonus test on client)