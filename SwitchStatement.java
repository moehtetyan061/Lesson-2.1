package lessons;

public class SwitchStatement {
    public static void main(String[] args) {
        //switch case
        // formula= swtich(..) { case.. : sout / case ....
        int a = 6;
        switch (a) {
            case 1:
                System.out.println(a + " is equal to 1 ");
                System.out.println("something");
                break; //if wanna stop
            case 2:
                System.out.println(a +" is equal to 2");
                break;
            case 3:
                System.out.println(a +" is equal to 3");
                break;
            case 4:
                System.out.println(a +" is equal to 4");
                break;
            case 5:
                System.out.println(a +" is equal to 5");
                break;
            default: //if all not same
                System.out.println("something was wrong");
        }

        String day = "friday";
        String str = " is weekday";
        switch (day){
            case "monday":
                System.out.println( day +str);
                break;
            case "tuesday":
                System.out.println(day + str );
                break;
            case "wednesday":
                System.out.println(day +str);
                break;
            case "thursday":
                System.out.println(day +str);
                break;
            case "Friday":
                System.out.println(day +str);
                break;
            default:
                System.out.println("weekend");
        }

    }
}
