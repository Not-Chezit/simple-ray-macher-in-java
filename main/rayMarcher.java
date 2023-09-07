package main;

import main.objectTypes.simpleShape;

public class rayMarcher {

   public static double[] getPixel(double[] worldData, double[] screenPixel)
   {
      double rx = worldData[0]; //import world data and set up vars
      double ry = worldData[1];
      double rz = worldData[2];
      double[] colorStorge = null;
      double xyRotation = worldData[3];
      double zRotation = worldData[4];
      double fov = (worldData[5]/1);
     
      boolean isWorking = true;
      boolean isSearching = true;
      double rayAge = 0;
      double stepSize = 1;
      double cheapAO = 0;

      double tempRotation = xyRotation + (screenPixel[0] * fov); //set up xyz velocitys/rotation
      double rzv = Math.sin(Math.toRadians(zRotation + (screenPixel[1] * fov)));
      double rxv = Math.cos(Math.toRadians(tempRotation)) * Math.cos(Math.toRadians(zRotation + (screenPixel[1] * fov)));
      double ryv = Math.sin(Math.toRadians(tempRotation)) * Math.cos(Math.toRadians(zRotation + (screenPixel[1] * fov)));
      
      //simpleShape tempShape = new simpleShape();//temp stuff
      double tempWorldData[] = worldData.clone();
      double tempPos[] = {50,0,0};
      double tempSize = 20;
      String tempTex = "";

      while(isWorking)
         {
            
            cheapAO ++;
            stepSize = 1;
            tempWorldData[0] = rx;
            tempWorldData[1] = ry;
            tempWorldData[2] = rz;

            isSearching = true;
            while(isSearching){
               stepSize++;
               colorStorge = simpleShape.cube(tempWorldData, tempPos, (tempSize+stepSize), tempTex);
               if(colorStorge[0] == 6.9){isSearching = false;}
               if(stepSize > 10){isSearching = false;}


            }
            stepSize += -1.0;
            if(stepSize < 1){stepSize = 1;}
            rx = rx + (rxv * stepSize);
            ry = ry + (ryv * stepSize);
            rz = rz + (rzv * stepSize);
            rayAge = rayAge + stepSize;
            
            tempWorldData[0] = rx;
            tempWorldData[1] = ry;
            tempWorldData[2] = rz;
            colorStorge =  simpleShape.cube(tempWorldData, tempPos, tempSize, tempTex);
            
            if(colorStorge[0] == 6.9){
               isWorking = false;
               cheapAO *= 5;
               colorStorge[1] -= cheapAO;
               colorStorge[2] -= cheapAO;
               colorStorge[3] -= cheapAO;
               if(colorStorge[1] < 0){colorStorge[1] = 0;}
               if(colorStorge[2] < 0){colorStorge[2] = 0;}
               if(colorStorge[3] < 0){colorStorge[3] = 0;}

            }
            if(rayAge >= 100){isWorking = false;}
         }


      
      return colorStorge;
   }
}  