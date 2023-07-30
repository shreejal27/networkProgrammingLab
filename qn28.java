
// Write a program to implement the concept of Data Conversion

public class qn28 {
    public static void main(String[] args) {
        // Implicit Data Conversion
        int numInt = 100;
        long numLong = numInt; // Implicitly converting int to long

        float numFloat = 3.14f;
        double numDouble = numFloat; // Implicitly converting float to double

        System.out.println("Implicit Data Conversion:");
        System.out.println("numInt (int): " + numInt);
        System.out.println("numLong (long): " + numLong);
        System.out.println("numFloat (float): " + numFloat);
        System.out.println("numDouble (double): " + numDouble);

        // Explicit Data Conversion (Type Casting)
        double numDouble2 = 123.45;
        int numInt2 = (int) numDouble2; // Explicitly converting double to int

        long numLong2 = 9999999999L;
        int numInt3 = (int) numLong2; // Explicitly converting long to int (may cause data loss)

        System.out.println("\nExplicit Data Conversion (Type Casting):");
        System.out.println("numDouble2 (double): " + numDouble2);
        System.out.println("numInt2 (int): " + numInt2);
        System.out.println("numLong2 (long): " + numLong2);
        System.out.println("numInt3 (int): " + numInt3);
    }
}