public class HW2Task4 {

    /*    4. Write a Java program to takes the user for a distance (in meters) and the time was taken
(as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour
    Test Data
    Input distance in meters: 2500
    Input hour: 5
    Input minutes: 56
    Input seconds: 23
    Expected Output :
    Your speed in meters/second is 0.11691531
    Your speed in km/h is 0.42089513*/

    public static void main(String[] args) {

        float distanceInMeters = 2500;
        int hour = 5;
        float minutes = 56;
        float seconds = 23;

        float totalSeconds = hour*3600+minutes*60+seconds;
        float metersInSecond = distanceInMeters/totalSeconds;

        float totalHours = hour+minutes/60+seconds/3600;
        float totalKm = distanceInMeters/1000;
        float kmPerHour = totalKm/totalHours;

        System.out.println("Your speed in meters/second is " + metersInSecond);
        System.out.println("Your speed in km/h is " + kmPerHour);

    }
}
