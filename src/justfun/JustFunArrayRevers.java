/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package justfun;

/**
 *
 * @author Igor
 */
public class JustFunArrayRevers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] numb = {1,2,3,4,5,6,7,8};
         for (int i = 0; i < numb.length/2;i++){
           int temp = numb [numb.length-i-1];
           numb [numb.length-i-1] = numb[i];
           numb[i]= temp;
       }
         for (int i = 0; i < numb.length; i++) {
             System.out.println(numb [i]);
            
        }
         Runtime runtime = Runtime.getRuntime();
         int coreCount= runtime.availableProcessors();
         System.out.println("Probably count of cores :"+coreCount );
      }
    
}
