package superMyMarket;

public interface CardInterFace {
    String paywithcard(double money,Product [] products,Client client);
    double getcardbalance(double money,Client client);
    Product [] deleteEndProduct(Product [] products);
}
