package task3;

public interface BasketInterface {
    public abstract Allproducts[] setProductinMagazin(Allproducts [] allproducts, Allproducts[] baskeds);
    public abstract Allproducts [] deleteProductinBasket(Allproducts[] baskeds);
    public abstract Chek [] getChekPrice(Allproducts [] allproducts,Allproducts [] baskeds,Chek [] cheks);
}
