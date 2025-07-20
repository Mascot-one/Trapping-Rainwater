import java.util.*;

public class JavaBasics{

    public static void main(String args[]){

        int height[] = {4, 2, 0, 3, 2, 5};
        int width = 1;

        System.out.print(trap(height,width));
    }

    public static int trap(int height[] , int width){
        int n = height.length;
        int Rmax[] = new int[n];
        int Lmax[] = new int[n];
        int Wlevel = 0;
        int twater = 0;

            //Calculate Right max elements and store in array
            Rmax [n-1] = height [n-1];
            for(int r = n-2 ; r >= 0 ; r--){

                Rmax[r] = Math.max(height[r],Rmax[r+1]);
            }

            //Calculate Left max elements and store in array
            Lmax [0] = height[0];
            for(int l = 1 ; l < n ; l++){

                Lmax[l] = Math.max(height[l],Lmax[l-1]);

            }


            //find minimum between Rmax & Lmax, then find if it is greater than height[i] then update total traped water 
            for(int i = 0 ; i < n ; i++){
                
                Wlevel = Math.min(Rmax[i],Lmax[i]);

                if ( Wlevel > height[i]){

                    twater = twater + (Wlevel - height[i])*width;
                }

           }
           return twater;
}
}