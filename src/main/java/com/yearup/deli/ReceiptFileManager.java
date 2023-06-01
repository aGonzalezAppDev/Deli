package com.yearup.deli;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//create a folder first time create if already there no need to create it. start adding file/receipt inside of the folder. receipts folder, and recipts in the file
// for loop for drinks etc and total price
// use the tostring we can do the sandwich etc,
public class ReceiptFileManager {

    public void saveOrder(Order order) throws IOException {
        Date date = new Date();
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-hh-mm-ss");
            String fileName = dateFormat.format(date) + ".txt";
            File folderPath = new File("C:\\LearnToCode_Capstones\\Deli\\receipts"); // "C:/LearnToCode_Capstones/Deli"
            folderPath.mkdirs();
            File file = new File(folderPath, fileName);
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            // write order details
            //writer.write(order.getNumOfOrder());


            // write sandwich details
            for (Sandwich sandwich : order.getSandwiches()) {
                writer.write(sandwich.printOrderDetails());
                writer.write(String.valueOf(sandwich.getPrice()));
            }
            // write drink details
            for (Drink drink : order.getDrinks()) {
                writer.write(drink.printDrinkOrder());
                writer.write(String.valueOf(drink.getPrice()));
            }
            // write chips details
            for (Chips chips : order.getChipsList()) {
                writer.write(chips.printChipsOrder());
                writer.write(String.valueOf(chips.getPrice()));
            }
            writer.close();
        } catch(Exception e)
        {
            System.out.println("Exception in File IO");
        }
    }
}
