/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpquetwo;

/**
 *
 * @author kena wk
 */
public class DataForJlist extends DataListBriger {
    ListInterface li;
    String data[][] = {{"toshiba pc", "100" },
            {"hp pc", "2000" },
            {"lenovo pc", "150" },
            {"asus pc", "1050" },
            {"mac pro pc", "50" },
            {"t-shirt", "2222" },
            {"nike shoe", "200" },
            {"air shoe", "1550" },            
            
            {"puma shoe", "100" }
    };
    String column[] = {"product","shippedNo"};
    String data1[] = {"toshiba pc","hp pc","asus pc","mac pro","t-shirt","nike shoe","air shoe","puma shoe"};

    @Override
    public void addTolist() {
        li.sortit();
        
         }
}
