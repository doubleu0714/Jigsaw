module sk.toy {
    requires public java.logging;
    exports com.toy.product;
    uses com.toy.product.ToyActionProvider;
}
