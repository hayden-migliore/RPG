//Creating basic Space for 
package MapData;

import ThingData.Thing;

public class Space {
    private Thing thing;
    private boolean full;
    
    //Default Constructor
    public Space(){
        this.thing = null;
        full = false;
    }
    
    //Map Constructor
    public Space(Thing thing){
        this.thing = thing;
        full = true;
    }
    
    public boolean checkSpace(){
        return full;
    }
    
    
    public void removeThing(){
        thing = null;
        full = false;
    }
    
    //Getters
    public Thing getThing(){
        return thing;
    }
    
    public boolean getFull(){
        return full;
    }
    
    //Setters
    public void setThing(Thing thing){
        this.thing = thing;
        full = true;
    }
    
    public void setFull(Boolean full){
        this.full = full;
    }
    
}
