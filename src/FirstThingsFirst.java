import java.util.Scanner;

public class FirstThingsFirst {

    public static void main(String[] args) {
        //Print line in console
        System.out.println("Welcome To Java! Let's do some f***ing exercises!!");
        //Changing lines
        System.out.println("You can either keep on making System.out.println's or you can just use\n\"\\n\" to change the line");
        //Usage of math directly in System.out.println();
        System.out.println("\nYou can even solve mathmatical formulas without any hard work!\n" +
                            "Here! Take a look: fx. 5+5 = "+(5+5) + "... It doesn't get any easier than that!");
        //Keep the formatting of the text
        System.out.println("\nA System.out.println even keeps your formatting, take a look at this:" +
                            "\nJJJJJJJ      A      V       V    A" +
                            "\n      J     A A      V     V    A A" +
                            "\n      J    AAAAA      V   V    AAAAA" +
                            "\nJ     J   A     A      V V    A     A" +
                            "\n JJJJJ   A       A      V    A       A" +
                            "\n\nNow.. Are you gonna tell me that shit ain't impressive?\nDidn't think so...");
    /*  Multiline
        comment
        just
        for
        show
     */

    //"Advanced" math
        System.out.println("\nHere you will see a bit more advanced math:");
        System.out.println("Fx. (9.5 * 4.5 - 2.5 * 3)/(45.5 - 3.5) is: " + ((9.5 * 4.5) - (2.5 * 3))/(45.5 - 3.5));
        System.out.println("You see? It ain't that hard...");
    //New math exercise
        System.out.println("\nHere you see the result of 1+2+3+4+5+6+7+8+9 = " + (1+2+3+4+5+6+7+8+9));
        System.out.println("Wow! Simply wow!");
    //Underneath you see an example of making things more difficult than they have to be (Table style)
        System.out.println("\nNow would you take a look at this fine table below.");
        int a=1;
        System.out.println("\na    a^2   a^3");
        System.out.println(a + "     " + a*a + "     " + a*a*a);
        a++;
        System.out.println(a + "     " + a*a + "     " + a*a*a);
        a++;
        System.out.println(a + "     " + a*a + "    " + a*a*a);
        a++;
        System.out.println(a + "    " + a*a + "    " + a*a*a);

    // At this time we are approx. at exercise 1.7


        double result = 4.0*(1.0-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11);

        System.out.println("Exercise 1.7.... solve 4.0*(1.0-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11)\n" +
                            "The result is: " + result);



        result = 4.0*(1.0-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11+1.0/13);
        System.out.println("And here's the result of 4*(1-1/3+1/5-1/7+1/9-1/11+1/13)" +
                            "\nThe result is = " + result);


        System.out.println("\nBelow you'll find an average speed in miles på hour: ");

        result = (14.0/1.6)/(60/45.5);
        System.out.println("and here's the result = " + result);

        System.out.println("\nNow you'll see somethin' real cool!!");
        Scanner scan = new Scanner(System.in);
        System.out.println("now enter a radius of a circle in the console. And this kickass" +
                "\nprogram will calculate the area of the circle:");
        double radius = scan.nextDouble();
        System.out.println("\nAnd here you see the area of a circle with radius = " + radius);
        System.out.println("");

        double area =


    }
}
