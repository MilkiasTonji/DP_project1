/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpproject;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author kena wk
 */
public class SortByAge  {
   static SwimmersData sd = new SwimmersData();
   static String[][] com =  sd.data;
   
   
   
   
   
   
   
  
   public void sortit(){
   Arrays.sort(com,new Comparator<String[]>(){
   public int compare(String[] a,String[] b){
       String itemOne = a[3];
       String itemTwo = b[3];
       return itemOne.compareTo(itemTwo);
   }
   
   });
   }
   
   
   
    
    
}
