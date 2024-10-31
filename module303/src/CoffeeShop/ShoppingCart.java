package CoffeeShop;


import java.util.TreeMap;

public class ShoppingCart {
    private TreeMap<String, Integer> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new TreeMap<>();
    }

    public void addItem(String name){
        this.shoppingCart.put(name, shoppingCart.getOrDefault(name, 0) + 1);
    }

    public void removeItem(String name){
        this.shoppingCart.remove(name);
    }

    public void reduceItem(String name){
        this.shoppingCart.replace(name, shoppingCart.getOrDefault(name, 0) - 1);
    }

    public void printCart(){
        this.shoppingCart.forEach((K, V) -> System.out.println(K + ": " + V));
    }
}
