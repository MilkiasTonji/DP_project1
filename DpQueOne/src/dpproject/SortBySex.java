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
public class SortBySex {
   static SwimmersData sd = new SwimmersData();
   static String[][] com =  sd.data;
   
   
   
   
   
   
   
   public static void display(){
       System.out.println("-------------------------------------");
		System.out.println("Item id\t\tQuantity");
		for (int i = 0; i < com.length; i++) {
			String[] itemRecord = com[i];
			System.out.println(itemRecord[0] + "\t\t" + itemRecord[1]+ "\t\t" + itemRecord[2]+ "\t\t" + itemRecord[3]+ "\t\t" + itemRecord[4]);
		}
		System.out.println("-------------------------------------");
	}
   public void sortit(){
   Arrays.sort(com,new Comparator<String[]>(){
   public int compare(String[] a,String[] b){
       String itemOne = a[4];
       String itemTwo = b[4];
       return itemOne.compareTo(itemTwo);
   }
   
   });
   }
   
    
}
