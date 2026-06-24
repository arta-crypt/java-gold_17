package com.javagold17.black.practice.chap1;

/**
 * Javaのラッパークラス練習
 */
public class WrapperClass {

    /**
     * Byteインスタンスを返す<br>
     * Javaにおけるbyteとは8bit(1Byte)符号付き整数<br>
     * 範囲：-128～127
     * 
     * @return Byteインスタンス
     */
    public static Byte getByteInstance() {
        return Byte.valueOf((byte) 127);
    }

    /**
     * Characterインスタンスを返す
     * 
     * @return Characterインスタンス
     */
    public static Character getCharacterInstance() {
        return Character.valueOf('a');
    }
}
