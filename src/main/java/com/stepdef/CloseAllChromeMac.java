package com.stepdef;

import java.io.IOException;

public class CloseAllChromeMac {
    
    public static void closeAllChrome() {
        try {
            // Mac: Force kill all Chrome processes
            ProcessBuilder pb = new ProcessBuilder("killall", "-9", "Google Chrome");
            pb.start();
            System.out.println("All Chrome browsers closed on Mac!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        closeAllChrome();
    }
}
