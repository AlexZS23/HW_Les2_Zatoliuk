public class HW2Task3 {
    
    /*    3. Write a Java program to compute body mass index (BMI).
    Test Data
    Input weight in pounds: 452
    Input height in inches: 72
    Expected Output:
    Body Mass Index is 61.30159143458721*/

    public static void main(String[] args) {

        int weightInPounds = 452;
        double indexPoundsToKg = 0.45359237;
        int heightInInches = 72;
        double indexInchToMeter = 0.0254;

        double massIndex = (weightInPounds*indexPoundsToKg)/Math.pow(heightInInches*indexInchToMeter, 2);

        System.out.println("Body Mass Index is " + massIndex);
    }
}
