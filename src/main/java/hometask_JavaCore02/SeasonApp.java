package hometask_JavaCore02;

import java.util.Scanner;

public class SeasonApp {
    public static void main(String[] args) {

       printSeason();




    }

    public static void printSeason(){
        System.out.println("Please, type the month: ");
        Scanner sc = new Scanner(System.in);
        String currentMonth = sc.nextLine();
        String season;



        switch (currentMonth) {
            case "January":
            case "February":
            case "December":
                season = Seasons.WINTER.name();
                break;
            case "March":
            case "April":
            case "May":
                season = Seasons.SPRING.name();
                break;
            case "June":
            case "July":
            case "August":
                season = Seasons.SUMMER.name();
                break;
            case "September":
            case "October":
            case "November":
                season = Seasons.AUTUMN.name();
                break;
            default:
                season = "Not a Month";
        }
        System.out.println(currentMonth + " is in the " + season + ".");

    }

}
