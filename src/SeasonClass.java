import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeasonClass {

    public static void main(String args[]) throws IOException {
        BufferedReader stream = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter the month:");
        String input = stream.readLine();
        Season inputSeason = seasonChooser(input);
        if (inputSeason != null){
            System.out.println(inputSeason);
        }
        else {
            System.out.println("There is not such month as //" + input + "// in seasons");
        }

    }

    public static Season seasonChooser(String input) {
        Season season = null;
        switch (input) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                break;
            case "June":
            case "Jule":
            case "August":
                season = Season.SUMMER;
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                break;
            default:
        }
        return season;
    }

    private enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }
}
