import java.util.Scanner;

public class SumIndex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] arr= new int[3][3];

        System.out.println("Enter a Array:");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Enter arr"+"["+i+"]"+"["+j+"]");
                int ind=scanner.nextInt();
                arr[i][j]= ind;
            }
        }

        int result=0;

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if(i==j){
                    result+=arr[i][j];
                };
            }
        }
        System.out.println(result);
    }
}
