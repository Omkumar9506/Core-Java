package Lecture20;

import java.io.IOException;

public class readSystem {
    public static void main(String[] args) throws IOException {
        int x = System.in.read();

        System.out.println((char)x);
    }
}

// A --> 65 --> Binary form of 65