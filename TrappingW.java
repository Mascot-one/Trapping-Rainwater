import java.util.*;

public class JavaBasics {                            

    public static void main(String args[]) {              
    Scanner sc = new Scanner(System.in);
    
    int height[] = {4,2,0,6,3,2,5};

    trap(height);
    }

    public static void trap(int height[]){
        
        int maxR = integer.MIN_VALUE;
        int maxL = integer.MIN_VALUE;
        int waterLvl = 0;
        int trapWtr = 0;

        for(int i = 0 ; i < height.length ; i++){

            for(int j = i ; j < height.length ; J++){      //maxRight

                if (height[j] > maxR){
                    maxR = height[j];
                }
            }

            for(int k = i ; k >= 0 ; k--){                 //maxLeft
                
                if (height[k] > maxL){
                    maxL = height[k]; 
                }    
            }

            
        }  
        
    
    }
}
