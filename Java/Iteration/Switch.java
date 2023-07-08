package Java.Iteration;

public class Switch {
    public static void main(String[] args) {
        String day = "Thursday";

        String task;
        switch (day) {
            case "Sunday":
                task = "야구하기";
                break;
            case "Monday":
                task = "농구하기";
                break;
            case "Tuesday":
            case "Wednesday":
                task = "수영하기";
                break;
            case "Thursday":
                task = "치킨먹기";
                break;
            case "Friday":
            case "Saturday":
                task = "휴식";
                break;
            default:
                task = "유효하지 않는 값";
        }

        // Java 14 이후 개선된 switch
        task = switch (day) {
            case "Sunday" -> "야구하기";
            case "Monday" -> "농구하기";
            case "Tuesday", "Wednesday" -> "수영하기";
            case "Thursday" -> {
                System.out.println("얏호!");
                yield "치킨먹기";
            }
            case "Friday", "Saturday" -> "휴식";
            default -> "유효하지 않는 값";
        };

        System.out.println(task);
    }
}