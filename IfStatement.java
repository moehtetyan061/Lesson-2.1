package lessons;

public class IfStatement{
    public static void main(String[] args) {

        //decision making statement
        //loop statement
        //jump statement

        /** Decision making statement
         * 1.if => if(condition){} =>if true, do something
         *
         * 2.switch
         */
        //boolean => true or false
        int a = 1;
        int b= 9;
        if (a < b){}

        if (a>b){
            System.out.println(( a>b) + " one statement");
        }else {
            System.out.println((a<b) + " two statement");

            int mark = 80 ;
            if(mark < 40 ){
                System.out.println("fail");
            }else if(mark >= 40 && mark <80) {
                System.out.println("pass");
            }else {
                System.out.println("D");
            }
        }




    }

}
