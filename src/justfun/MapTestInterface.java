/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package justfun;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTestInterface {
    public static void main(String[] args) {
        HashMap <Integer,String> MyMap= new HashMap <>();
    MyMap.put(1, "Klaus");
    MyMap.put(2, "Pengvin");
    MyMap.put(3, "Lori");
    MyMap.put(4, "Krups");
    MyMap.put(5, "Frank");
    MyMap.put(6, "Salii");
    // for (Map.Entry<Integer,String> entry :MyMap.entrySet() )
 // or
    for (Map.Entry<Integer,String> entry :MyMap.entrySet() ){
        System.out.println(entry.getKey()+"-"+ entry.getValue());    
    }
        
}
    }
    
    
    

