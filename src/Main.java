import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of elements n:");
        int n = Integer.parseInt(reader.readLine());
        int array[] = new int [n];

        for (int i = 0; i<n; i++){
            System.out.println("Enter element "+(i+1)+": ");
            array[i]=Integer.parseInt(reader.readLine());
        }

        int max = array[0]+array[1];
        int maxElement=0;
        for(int i = 0; i<array.length-1;i++){
            if ((array[i]+array[i+1])>max){
                max = array[i]+array[i+1];
                maxElement = i;
            }
        }
        System.out.println("(a("+maxElement+")= "+array[maxElement]+", a("+(maxElement+1)+")= "+array[maxElement+1]+") "+"max= "+ max);
    }
}