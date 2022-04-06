package Array;

public class JavaArray {

    public static void main(String[] args) {
        //variable
        int a =69;//initialize
        String name="Moe Htet Yan";

      //array
        int numbers[] = {58,64,56,36,90,30};//initialize
        //   room number=0  1  2  3  4  5
        //total room=6 rooms
        String names[] = new String[]{"Moe","Toe Toe","Vee","Cola","Yu",null,""};
        //if you wanna change room's value
        names[2]= "page";
        System.out.println(names[2]);

        String cars[] = new String[4];//defines an array as a room
        cars[0]= "marcedes";
        cars[2]= "toyota";
        cars[3]= "lamborghini";
        System.out.println(cars[1]);//null because room1 is blank

        System.out.println(numbers[4]);//access

        numbers[5]=98;
        System.out.println(numbers[5]);

        System.out.println(names[5]);

        /**if you want to know which room array has
         names.length.sout **/
        System.out.println(names.length);//answer 7

        System.out.println(cars);
        System.out.println(numbers);

        /**looping array easy way => names.fori=> sout[i]

           for (int i = 0; i < names.length; i++) {
               System.out.print(names[i]+ "\t");
         **/

          for (int i =1; i< names.length; i++){
              System.out.println(names[i]);//start room2
              /**
               * if i = 2 answers is started from room3
               */
        }
    }
}
