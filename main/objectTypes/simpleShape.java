package main.objectTypes;

public class simpleShape{
    public static double[] cube(double[] worldData, double[] pos, double size, String texture){
        double[] output = {0,0,0,0};
        double rx = worldData[0];
        double ry = worldData[1];
        double rz = worldData[2];
        if ((pos[0] - size) <= rx && rx <= (pos[0] + size)) {
        if ((pos[1] - size) <= ry && ry <= (pos[1] + size)) {
        if ((pos[2] - size) <= rz && rz <= (pos[2] + size)) {
            output[0] = 1;
            output[1] = 255;
            output[0] = 0;
            output[0] = 0;
        }    
        }
        }



        return output;
     }
    }
