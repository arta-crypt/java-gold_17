package com.javagold17.black.practice.chap1;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("===== Q1: Wrapper Class =====");
        System.out.printf("%-10s: %02X\n", "Byte", WrapperClass.getByteInstance());
        System.out.printf("%-10s: %c\n", "Character", WrapperClass.getCharacterInstance());
        System.out.println();
        System.out.println("===== Q2: Generics =====");
        // 型指定してない方はコンパイル時はObject型として扱われる
        // ただし、実行時の型はString
        Generics.Value val1 = new Generics.Value("Hello");
        Generics.Value val2 = new Generics.Value<String>("Hello");
        // Value クラスの getVal メソッドの定義情報を取得
        Method method1 = val1.getClass().getMethod("getVal");
        // メソッドの戻り値の型（定義上の型）を取得
        Class<?> returnType1 = method1.getReturnType();
        // 型の表示
        System.out.printf("%-10s: %-10s\n", "型指定なし", returnType1.getCanonicalName());
        System.out.printf("%-10s: %-10s\n", "型指定あり", val2.getVal().getClass().getCanonicalName());
    }
}
