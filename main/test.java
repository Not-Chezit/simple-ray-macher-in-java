package main;
import main.rayMarcher;

public class test {
    public static void main(String[] args) {
        rayMarcher worker1 = new rayMarcher();
        
        for (double ix = 0; ix < 16; ix++) {
            for (double iy = 0; iy < 16; iy++) {
                


                System.out.print(worker1.getPixel(null, null));





            }
            System.out.println();

        }
    

    }
}