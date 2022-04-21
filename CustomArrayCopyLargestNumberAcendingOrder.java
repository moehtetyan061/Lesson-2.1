package Array;

public class CustomArrayCopyLargestNumberAcendingOrder {
    public static void main(String[] args) {

         int one[] = {10, 20, 30, 40, 60 };
        int largest = one[0];
        int smallest = one[0];
        for (int i = 1; i < one.length; i++) {
            if (one[i] > largest) {
                largest = one[i];
            } else if (one[i] < smallest) {
                smallest = one[i];
            }
        }
        System.out.println(largest +" is largest");
        System.out.println(smallest+ " is smallest");

        int number[] = {3,5,9,4,7,6,2,4,8};
        int valueNow = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    valueNow = number[i];
                    number[i]= number[j];
                    number[j]=valueNow;
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] +" \t");
        }
        System.out.println();
        System.out.println(number[number.length -2]);
    }
}