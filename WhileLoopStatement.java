package lessons;

public class WhileLoopStatement{
    public static void main(String[] args) {

        //while
        //while(true){sout}...
        //do { sout }while(true)
        int a = 7;
        while(a<11) //8 9 10
        {
            System.out.println(a);
            a++;//a++ can control loop //11
        }
        do {
            System.out.println(a);
            a+=3;//11+3
        } while (a<22); //14 17 20

    }
}
