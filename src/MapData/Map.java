//Create basic map
package MapData;

import ThingData.Thing;

public class Map {
    final private int height;
    final private int width;
    final private Space[][] spaceArray;
    
    //Constructor
    public Map(int height, int width){
        this.height = height;
        this.width = width;
        spaceArray = new Space[height][width];
    }
    
    public void moveThing(int height1, int width1, int height2, int width2){
        try{
            Space space1 = spaceArray[height1][width1];
            Space space2 = spaceArray[height2][width2];
            
            if(space1.getFull() == true && space2.getFull() == false){
                Thing thing = space1.getThing();
                space1.removeThing();
                space2.setThing(thing);
            }
            else if(space1.getFull() == false){
                System.out.println("There is nothing in Space 1.");
            }
            else{
                System.out.println("There is something already in Space 2.");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){ }
    }
    
    //Getters
    public int getHeight(){
        return height;
    }
    
    public int getWidth(){
        return width;
    }
    
    public Space getSpace(int height, int width){
        try{
            return spaceArray[height][width];
        }
        catch(ArrayIndexOutOfBoundsException e){
            return null;
        }
    }
    
    public Thing getSpacesThing(int height, int width){
        try{
            return spaceArray[height][width].getThing();
        }
        catch(ArrayIndexOutOfBoundsException e){
            return null;
        }
    }
}
