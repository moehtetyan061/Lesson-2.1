package Array;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int numbers[][]= new int[4][5];

        int dNumbers[][]={
                {1,2,3,8,5,6,7},//row
                {5,4,3,2,1},
                {1,1,1,1,1000},
                {5,5,3,3,4}
        };
       // System.out.println(dNumbers[2][4]);//answer 1000
        dNumbers[3][2]=7;
      //  System.out.println(dNumbers[3][2]);
        //System.out.println(dNumbers.length);//show room 4

       // System.out.println(dNumbers[0].length);//answer5 room's room
      //  for (int i = 0; i < dNumbers[0].length; i++) {
          //  System.out.println(dNumbers[0][i]);}
        for (int row=0; row < dNumbers.length; row++){
            for (int colum =0; colum<dNumbers[row].length; colum++){
                System.out.print(dNumbers[row][colum]);
            }
            System.out.println();
        }


    }
}
