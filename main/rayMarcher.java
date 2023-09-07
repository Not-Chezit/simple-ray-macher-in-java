package main;



public class rayMarcher {

   public static int[] getPixel(double[] worldData, double[] screenPixel)
   {
      double rx = worldData[0]; //import world data and set up vars
      double ry = worldData[1];
      double rz = worldData[2];
      int[] colorStorge = {0,0,0};
      double xyRotation = worldData[3];
      double zRotation = worldData[4];
      double fov = (worldData[5]/2);
      boolean isWorking = true;


      double tempRotation = xyRotation + (screenPixel[0] * fov); //set up xyz velocitys/rotation
      double rzv = Math.sin(zRotation + (screenPixel[1] * fov));
      double rxv = Math.cos(tempRotation);
      double ryv = Math.sin(tempRotation);
      
      while(isWorking);
         {
   




         }



      return colorStorge;
   }
}  