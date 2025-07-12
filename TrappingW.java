import java.util.*;

public class TrappingW {                            

    public static void main(String args[]) {              
    Scanner sc = new Scanner(System.in);
    
    int height[] = {4,2,0,6,3,2,5};
    int width = 1;

    trap(height,width);
    }

    public static void trap(int height[], int width){
        
        int maxR = Integer.MIN_VALUE;
        int maxL = Integer.MIN_VALUE;
        int waterLvl = 0;
        int trapWtr = 0;

        for(int i = 0 ; i < height.length ; i++){

            for(int j = i ; j < height.length ; j++){      //maxRight

                if (height[j] > maxR){
                    maxR = height[j];
                }
            }

            for(int k = i ; k >= 0 ; k--){                 //maxLeft
                
                if (height[k] > maxL){
                    maxL = height[k]; 
                }    
            }

            
            if (maxR > maxL){                              //Take small one between maxL & maxR to find water level
                waterLvl = maxL;
            }else{
                waterLvl = maxR;
            }

            
            if (waterLvl > height[i]){                     //if water level is more than height then only we can find trapped water level of perticuler block(if not then no change in trapWtr)  
               trapWtr = trapWtr + (waterLvl - height[i])*width ; //formula to calculet total trapped water [Area = (water level - height of block) * Width of block]
            }

            maxR = Integer.MIN_VALUE;                   //Adjust the main variables at original position after using it because there is stores some values when we used it 
            maxL = Integer.MIN_VALUE;
            waterLvl = 0;
        }   
        
        System.out.print("Trapped Rain water =  "+ trapWtr);
    }
}
