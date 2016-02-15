import java.util.Scanner;
import java.util.LinkedList;

public class CoffeeMaker {

    String noItems = "You don't see anything out of the ordinary.";

    Room r1 = new Room("Small", "Quant Sofa", "Magenta", null, "Creamy Cream");
    Room r2 = new Room("Funny", "Sad record player", "Beige", "Massive", noItems);
    Room r3 = new Room("Refinanced", "Tight pizza", "Dead", "Smart", "caffeinated coffee");
    Room r4 = new Room("Dumb", "Flat energy drink", "Vivacious", "Slim", noItems);
    Room r5 = new Room("Bloodthirsy", "Beautiful bag of money", "Purple", "Sandy", noItems);
    Room r6 = new Room("Rough", "Perfect air hockey table", null, "Minimalist", "sweet sugar");

    LinkedList<Room> roomList;

    public CoffeeMaker(){
        roomList = new LinkedList<Room>();
    }


    public static void main(String[] args){

    }

}
