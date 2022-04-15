// Java program for Method Overloading
// by Using Different Numbers of Arguments

// Class 1
// Multiplier class
class Multiplier {

    // Method 1
    // Multiplication of 2 numbers
    static int Multiply(int a, int b)
    {

        // Return product
        return a * b;
    }

    // Method 2
    // // Multiplication of 3 numbers
    static int Multiply(int a, int b, int c)
    {

        // Return product
        return a * b * c;
    }
}

// Class 2
// Main class
class Main {

    // Main driver method
    public static void main(String[] args)
    {

        // Calling method by passing
        // input as in arguments
        System.out.println(Multiplier.Multiply(2, 4, 6));
        System.out.println(Multiplier.Multiply(2, 7, 3));
    }
}
