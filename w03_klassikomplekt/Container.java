public class Container {
    public int boxCount = 0;
    public void put(int boxes){
        boxCount += boxes;
    }

    public int boxes(){
        return boxCount; 
    }
    public int get(int boxes){
        if (boxCount >= boxes){ //when boxes amount is more than person wants 
            boxCount -= boxes;
            return boxes; 
            
        }
        else { //when boxCount less than boxes
            boxes = boxCount;
            boxCount = 0;
            return boxes; 
        }
    

    }
}
