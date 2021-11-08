public class HW2Task1 {

/*1. Write a Java program that reads a number in inches, converts it to meters.
            Note: One inch is 0.0254 meter.
            Test Data
    Input a value for inch: 1000
    Expected Output :
            1000.0 inch is 25.4 meters*/

    public static void main(String[] args) {

        double inch = 1000.0;
        double convertValue = 0.0254;

        System.out.println(inch + " inch is " + inch*convertValue + " meters");
    }
}
