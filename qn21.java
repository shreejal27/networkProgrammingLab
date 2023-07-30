// Write a program to get the time when a URL was last changed.

import java.net.*;
import java.util.*;

public class qn21 {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://www.example.com");
            URLConnection uc = u.openConnection();
            System.out.println("Last modified: " + new Date(uc.getLastModified()));
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}