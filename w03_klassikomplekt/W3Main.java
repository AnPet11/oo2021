public class W3Main {
    public static void main(String[] args){
        Container container1 = new Container();
        Container container2 = new Container();
        Container container3 = new Container();
        Warehouse warehouse = new Warehouse();
        warehouse.put(container1);
        warehouse.put(container2);
        warehouse.put(container3);
        System.out.printf("Nii palju karpi on %d\n", warehouse.amount());

        container1.put(666);
        container2.put(999);
        container3.put(123);
        System.out.printf("Nii palju just sai pandud %d\n", warehouse.amount());

        container1.put(container3.get(100));
        System.out.printf("Nii palju just sai vahetatud %d\n", warehouse.amount());

    } // static method can be called without an object creation
    
    
}
