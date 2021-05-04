package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы 2
*/

public class Solution {
    public static class Product {
        int id;
        String name;
        String price;
        String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public static Product getProduct(String string) {
            String id = string.substring(0, 8).trim();
            String name = string.substring(8, 38).trim();
            String price = string.substring(38, 46).trim();
            String quantity = string.substring(46, 50).trim();
            return new Product(Integer.parseInt(id), name, price, quantity);
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        if (args.length == 0) {
            return;
        }

        ArrayList<Product> products = new ArrayList<>();

        try (BufferedReader readFile  = new BufferedReader(new FileReader(fileName))) {
            while (readFile.ready()) {
                Product product = Product.getProduct(readFile.readLine());
                products.add(product);
            }
        }
        int idToFind = Integer.parseInt(args[1]);
        switch (args[0]) {
            case "-d":

                for (Product product:products) {
                    if (product.id == idToFind) products.remove(product);
                }

            case "-u":
                for (Product product:products) {
                    if (product.id == idToFind) {
                        product.name = args[2];
                        product.price = args[3];
                        product.quantity = args[4];
                    }
                }
        }

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (Product product: products) {
                fileWriter.write(product.toString());
                fileWriter.write("\n");
            }
        }



    }
}
