
package ItemData;


public class Item {
    private int value;
    private String name;
    
    //Constructor
    public Item(String name, int value){
        this.name = name;
        this.value = value;
    }
    
    //Getters
    public String getName(){
        return name;
    }
    
    public int getValue(){
        return value;
    }
    
    //Setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setValue(int value){
        this.value = value;
    }
}
