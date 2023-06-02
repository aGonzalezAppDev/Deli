package com.yearup.deli;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ReceiptFileManager {

    public void saveOrder(Order order) throws IOException {
        Date date = new Date();
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
            String fileName = dateFormat.format(date) + ".txt";
            File folderPath = new File("C:/LearnToCode_Capstones/Deli/receipts"); // "C:/LearnToCode_Capstones/Deli"
            folderPath.mkdirs();
            File file = new File(folderPath, fileName);
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            // write order details

            // write sandwich details
            for (Sandwich sandwich : order.getSandwiches()) {
                writer.write(sandwich.printOrderDetails());
                writer.write('\n');
                writer.write("$ " + sandwich.getPrice());
                writer.write('\n');
            }
            // write drink details
            for (Drink drink : order.getDrinks()) {
                writer.write('\n');
                writer.write(drink.printDrinkOrder());
                writer.write("$ " + drink.getPrice());
                writer.write('\n');
            }
            // write chips details
            for (Chips chips : order.getChipsList()) {
                writer.write('\n');
                writer.write(chips.printChipsOrder());
                writer.write("$ " + chips.getPrice());
            }
            writer.write("-----------------------------------------");
            writer.write('\n');
            double totalPrice = order.getTotalPrice();
            writer.write("The total price is: $ " + totalPrice);
            writer.close();
        } catch(Exception e)
        {
            System.out.println("Exception in File IO");
        }
    }
}
