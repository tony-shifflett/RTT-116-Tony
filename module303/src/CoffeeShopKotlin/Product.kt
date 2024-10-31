package CoffeeShopKotlin

class Product (private var name: String, private var price: Double, private var quantity: Int) {
    fun getPrice() = price
    fun setPrice(price: Double) {
        this.price = price
    }

    fun setName(name: String){
        this.name = name
    }
    fun getName() = name
    
    fun setQuantity(quantity: Int) {
        this.quantity = quantity
    }
    fun getQuantity() = quantity
}