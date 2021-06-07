public class Bottle {
    public double volume;
    public int type;
    public double price;
    public double weight;
    public Drink drink;

    public double DrinkBottleWeight(){
        double weight = this.weight;
        if (drink != null){
            weight += drink.weight * volume;
        }
        return weight;
    }
    public double DrinkBottlePrice(){
        double price = this.price;
        if (drink != null){
            price += drink.pricePerLiter * volume;
        }
        return price;
    }
}
