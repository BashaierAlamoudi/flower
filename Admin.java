package classes;

import java.util.ArrayList;

public class Admin {

    // To store all flowers avaiable in the store
    private static ArrayList<Flower> flowers = new ArrayList<>();
    // To track the flowers that have been added
    private static int indx = 0;

    public static ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public static int getIndx() {
        return indx;
    }

    public static void setFlowers(ArrayList<Flower> flowers) {
        Admin.flowers = flowers;
    }

    public static void setIndx(int indx) {
        Admin.indx = indx;
    }

    // This method is responsible to add any new flower to the store
    // It will require first to create a flower object (new Flower) then call this method to insert the flower into the store
    public static boolean addFlower(Flower f) {

        // Add the flower to the store (array)
        flowers.add(f);
        // If the flower has been added sucessfully, it will be equal to the latest flower in the array
        boolean isAdded = flowers.get(indx).equals(f);
        // Increase the variable to track the next flower
        if(isAdded==true)indx++;
        // True if added & false if not 
        return isAdded;

    }

    // This method is responsible to delet any flower
    public static boolean deleteFlower(String FlowerType) {
        // Loop to search in the array
        for (int i = 0; i < flowers.size(); i++) {
            // If the type equals the entered type then delete it
            if (flowers.get(i).getFlowerType().equalsIgnoreCase(FlowerType)) {
                flowers.remove(i);
                indx--;
            }
            // Means the flower has been deleted
            return true;
        }
        return false;
    }

}
