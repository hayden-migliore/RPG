//Creating Basic Thing (Basis of all things that will appear on the map)
package ThingData;



public class Thing {
    private String name;
    
    //Constructor
    public Thing(String name){
        this.name = name;
    }
    
    //Getters
    public String getName(){
        return name;
    }
    
    //Setters
    public void setName(String name){
        this.name = name;
    }
}
