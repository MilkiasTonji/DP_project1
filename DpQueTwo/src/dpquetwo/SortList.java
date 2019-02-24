/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpquetwo;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author kena wk
 */
public class SortList implements ListInterface {
    DataForJlist djl = new DataForJlist();
    String data[][] = djl.data;
    
    
    
    public void sortit(){
   Arrays.sort(data,new Comparator<String[]>(){
   public int compare(String[] a,String[] b){
       String itemOne = a[0];
       String itemTwo = b[0];
       return itemOne.compareTo(itemTwo);
   }
   
   });
   }
    
}
