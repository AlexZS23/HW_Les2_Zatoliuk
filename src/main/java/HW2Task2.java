public class HW2Task2 {
    
    /*    2. Write a Java program to convert minutes into a number of years and days.
    Test Data
    Input the number of minutes: 3456789
    Expected Output :
            3456789 minutes is approximately 6 years and 210 days*/

    public static void main(String[] args) {

        int minutes = 3456789;
        int minPerYear = 525600;
        int minPerDay = 1440;
        int dayPerYear = 365;

        System.out.println(minutes + " minutes is approximately " + minutes/minPerYear + " years and " + (minutes/minPerDay-minutes/minPerYear*dayPerYear) + "  days");

    }
}

