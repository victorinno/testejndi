package com.company;

import com.sun.jna.Native;

public class Main {

    public static void main(String[] args) {
        HelloC helloC = (HelloC) Native.load("libuntitled", HelloC.class);
        helloC.hello();
    }
}
