import java.util.ArrayList;
import java.util.stream.IntStream;

public class Basket {
    private ArrayList<Item> items = new ArrayList<Item>();
    public void Add(String name, int amount, double price) throws Exception{
        if (amount <=0){
            throw new Exception("Amount is a negative. Dont exist.");
        }
        if (price < 0){
            throw new Exception("Price cant be less than 0.");

        }
        
        Item item = new Item();  // got the object and assign values
        item.name = name;
        item.price = price;
        item.amount = amount;

        items.add(item); // put into warehouse

    }
    public void Print(){
        items.forEach((item) -> {
            System.out.printf("%s\t%d\t%f", item.name, item.amount, item.price);
        });
    }

    public Item Cheap(){
        /*
        Item cheapitem = null; //objects are null. but int are 0

        for (Item item : items) {
            if (cheapitem == null){ // the second iteam is not already null
                cheapitem = item; 
            }

            else {
                if (item.price < cheapitem.price){
                    cheapitem = item;
                }
            }
        }
        
        return cheapitem;
        */

        return items.stream().min((a, b) ->  Double.compare(a.price, b.price)).orElse(null);


    }

    public Item Expensive() {
        return items.stream().max((a, b) ->  Double.compare(a.price, b.price)).orElse(null);
    }

    public boolean AllSamePrice(double price)
    {
        return items.stream().allMatch(item -> item.price == price);
    }


}
