import java.util.ArrayList;

import jdk.vm.ci.meta.Assumptions.ConcreteMethod;
import java.util.*;

public class Warehouse
{
    ArrayList<Container> space = new ArrayList<Container>();
    public void put(Container container){
        space.add(container);
    }

    public int amount(){
        int counter = 0;

        for ( int i = 0; i < space.size(); i++ ){
            counter += space.get(i).boxes();  //counter = counter + space.get(i).boxes();
            
        }
        return counter;
    }
    


}