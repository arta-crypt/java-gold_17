package com.javagold17.purple.sample.chap6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 第6章 ファイルI/O<br>
 * サンプル練習
 */
public class Main {
    public static void main(String[] args) {
        String basePath = "src/main/resources/files/purple/sample/chap6";
        execFileIOStream(basePath);
    }

    /**
     * FileInputStream/FileOutputStream練習
     * 
     * @param basePath 操作するファイルのベースパス（相対パス）
     */
    private static void execFileIOStream(String basePath) {
        String file = "data1.txt";
        String fullPath = basePath + "/" + file;
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
