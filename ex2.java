public class ex2 {
    //Write a program that initializes a string with "Mississippi". Then replace all "i" with "ii"
    // and print the length of the resulting string. In that string, replace all "ss" with "s"
    // and print the length of the resulting string.
    public static void main(String[] args) {
        String name=new String("Mississippi");
        name=name.replaceAll("i","ii");
        System.out.println(name);
        System.out.println("length="+name.length());
        name=name.replaceAll("s","ss");
        System.out.println(name);
        System.out.println("length="+name.length());


    }
}
