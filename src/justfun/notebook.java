
package justfun;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class notebook {
    public static void main(String[] args) {
      noteBook = new TreeMap <>();
      scanner = new Scanner(System.in);
      notebook not = new notebook();
      for(;;){
      System.out.println("Hello you in main menu"+"\n"+ "Please chose operantion");
       mainOperation = scanner.next();
      if(mainOperation.equalsIgnoreCase(add)){
          Scanner addscanner = new Scanner(System.in);
          System.out.println("Input name");
          String name = addscanner.next();
          System.out.println("Input number");
          Integer number= addscanner.nextInt();
          not.addContact(name, number);  }
      if(mainOperation.equalsIgnoreCase(remove)){
          System.out.println("Make choose and enter you to remove by name or by number" );
          Scanner removescanner = new Scanner(System.in);
          String nameOrNumber =removescanner.next();
          if (nameOrNumber.equalsIgnoreCase("name")){
              Scanner removeName = new Scanner(System.in);
              System.out.println("Input name :");
          String name =removeName.next();
          if (noteBook.containsKey(name)){
         not.removeContactByName(name);
              System.out.println("Removed :"+ name );}
              System.out.println("There is no such contact !");
          } 
          else if (nameOrNumber.equalsIgnoreCase("number")){
          Scanner removeNumber = new Scanner(System.in);
          System.out.println("Input number :");
          int number =removeNumber.nextInt();
                not.removeContactByNumber(number);
             System.out.println("Removed :"+ number );} }
      if(mainOperation.equalsIgnoreCase(displayAllContact)){
          System.out.println("Your saved contacts :");
          not.displayAllContact();} }
    }
static Map <String,Integer> noteBook ;   
static Scanner scanner;
static String add  = "add";
static String remove = "remove";  
static String displayAllContact = "show"; 
static String mainOperation;

public void addContact (String Name,Integer Number){
    if (!noteBook.containsKey(Name)&&!noteBook.containsValue(Number)){
        noteBook.put(Name, Number); System.out.println("Contact :"+Name+"-"+ Number+ " added"); }    
}

public void removeContactByName (String Name){
    if (noteBook.containsKey(Name)){
      noteBook.remove(Name);
        System.out.println("Contact :"+Name + " removed");
    }
}
public void removeContactByNumber (Integer Number){
    
    for (Entry<String,Integer> entery :noteBook.entrySet()){
        if (entery.getValue().equals(Number)){
            noteBook.remove(entery.getKey());
        System.out.println("Contact :"+Number +" removed");
        }
    }
}
public void displayAllContact (){
    if(noteBook.isEmpty()){System.out.println("Notebook is empty.");}
    for (Map.Entry<String,Integer> entry : noteBook.entrySet()){
        System.out.println( entry.getKey()+"-"+ entry.getValue());}   
}

}
