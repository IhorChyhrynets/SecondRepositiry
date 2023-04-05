/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package justfun;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class NewMyOwnException {
    public static void main(String[] args) {
        File file = new File("dfg");
        try{
        Scanner scanner = new Scanner(file);}
        catch (FileNotFoundException ex){ /*ex.printStackTrace(System.out);*/}
        
        System.out.println("Here next action");
    }
}
class MyException extends Exception {
    public MyException (String message){
        super (message);
    }
}
