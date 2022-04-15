// Java program to illustrate the
// concept of single inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

class one {
    public void print_A()
    {
        System.out.println("A");
    }
}

class two extends one {
    public void print_B() { System.out.println("B"); }
}
// Driver class
public class Main {
    public static void main(String[] args)
    {
        two g = new two();
        g.print_A();
        g.print_B();
        g.print_A();
    }
}
