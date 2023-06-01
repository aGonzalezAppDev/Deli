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
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-hh-mm-ss");
        File file = new File (dateFormat.format(date) + ".txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        // write order details
        //writer.write(order.getNumOfOrder());
        writer.close();

        // write sandwich details
        for(Sandwich sandwich : order.getSandwiches()) {
            writer.write(sandwich.getBread()+ sandwich.getSize() + "|" + "|" + sandwich.getToasted());
        }

    }
}
