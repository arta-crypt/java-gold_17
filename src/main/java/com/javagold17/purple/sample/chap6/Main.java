package com.javagold17.purple.sample.chap6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "src/main/resources/files/purple/sample/chap6";
        String file = "data1.txt";
        String fullPath = path + "/" + file;
        try (FileOutputStream fos = new FileOutputStream(fullPath);
                FileInputStream fis = new FileInputStream(fullPath)) {
            fos.write("abcd".getBytes());
            fos.write(101);
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print(i + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
