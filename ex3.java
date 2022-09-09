// Write a program ReplaceTester that encodes a string by replacing all letters "i" with "!"
// and all letters "s" with "$". Use the replace method. Demonstrate that
//you can correctly encode the string "Mississippi". Print both the actual and expected result.

public class ex3 {
    public static void main(String[] args) {
        String name=new String("Mississippi");
        name=name.replaceAll("i","!");
        System.out.println("actual name"+name);

        name=name.replaceAll("s","$");


    }
}
