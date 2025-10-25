public class Product<T, U> {
    T item;
    U price;

    public Product(T item, U price) {
        this.item = item;
        this.price = price;
    }
}
