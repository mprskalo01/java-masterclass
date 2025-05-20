package org.mprskalo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 2 or 1");
//        }
//        int switchValue = 3;
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Value was 3, 4 or 5");
//                System.out.println("The final value was " + switchValue);
//                break;
//            default:
//                System.out.println("Value was not 1, 2, 3, 4 or 5");
//                break;
//        }
        int switchValue = 1;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3, 4 or 5");
                System.out.println("The final value was " + switchValue);
            }
            default -> System.out.println("Value was not 1, 2, 3, 4 or 5");
        }

        String month = "April";
        System.out.println(month + " is in the " + getQuarter(month) + ".");
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> "1st Quarter";
            case "April", "May", "June" -> "2nd Quarter";
            case "July", "August", "September" -> "3rd Quarter";
            case "October", "November", "December" -> "4th Quarter";
            default -> "Invalid month";
        };
    }
}