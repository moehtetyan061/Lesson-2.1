package Array;

public class JaggedArrayArrayCopyClone {
    public static void main(String[] args) {

        String names[] = new String[]{"Moe","Toe Toe","Vee","Cola","Yu",null};

        String cars[] = new String[4];//defines an array as a room
        cars[0]= "marcedes";
        cars[2]= "toyota";
        cars[3]= "lamborghini";
        for (String name : names) {
            System.out.print(name+"\t");
        }
        System.out.println();
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i]+"\t");
        }
        System.out.println();
        //DuplicateElement
        int numbers[] = {1,2,3,4,5,3,4,7,8,9,9};

        for(int i=0; i< numbers.length; i++){
            for(int j =i+1; j< numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    System.out.println(numbers[j]);
                }
            }
        }
        //arraycopy
        int num[]= {1,2,3,9,8,7,5,4,3};

        int other[]= new int[6];
        System.arraycopy(num,3,other,0,4);
        for (int i = 0; i < other.length; i++) {
            System.out.print(other[i]+"\t");
        }
        System.out.println();
        int another[] = other.clone();
        for (int i = 0; i < another.length; i++) {
            System.out.print(another[i]+"\t");
        }
        //jaggedArray
        int no[][]= new int[3][];
        no[0] = new int[5];
        no[1] = new int[2];
        

    }
}
