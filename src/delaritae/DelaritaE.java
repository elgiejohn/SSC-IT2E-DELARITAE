
package delaritae;

import java.util.Scanner;

public class DelaritaE {


    public static void main(String[] args) {
        
    Scanner input = new Scanner (System.in);
    
    String cname,pname;
    int qty, price, cash, tdue, change;
    
    System.out.print("Enter customer Name: ");
    cname = input.nextLine();
    System.out.print("Enter Product Name: ");
    pname = input.nextLine(); 
    System.out.print("Enter Quantity: ");
    qty = input.nextInt(); 
    System.out.print("Enter Price: ");
    price = input.nextInt(); 
    System.out.print("Enter Cash: ");
    cash = input.nextInt(); 

  
    System.out.println("------------------------------");
    System.out.println("RECEIRT");
    System.out.println("------------------------------");
    
    System.out.println("Name:"+cname);
    
    System.out.println("Item Name:"+pname);
    System.out.println("Quantity:"+qty);
    
    System.out.println("------------------------------");
    
    tdue = price*qty;
    System.out.println("Total Due:"+tdue+".00");
    System.out.println("cash:"+cash+".00");
    
    System.out.println("------------------------------");
    
    change = cash - tdue;
     System.out.println("change:"+change+".00");
    
    }
    
}
