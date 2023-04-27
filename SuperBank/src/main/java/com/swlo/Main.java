package com.swlo;

public class Main {
    public static void main(String[] args) {
        UpdateThread rendimento = new UpdateThread();
        Data.loadData();
        Data.startScreen.firstScreen();



    }
}