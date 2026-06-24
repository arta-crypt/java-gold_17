package com.javagold17.black.practice.chap1;

public class Generics {
    public static class Value<T> {
        private T val;

        public Value(T val) {
            super();
            this.val = val;
        }

        public T getVal() {
            return val;
        }
    }

}
