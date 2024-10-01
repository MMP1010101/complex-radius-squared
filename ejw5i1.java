import java.util.ArrayList;
import java.util.Scanner;

public class ejw5i1 {
    public static void main(String[] args) {
        double r = 0;
        int c = 1;
        int n = 10000;
        double pi = 0.0;

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner inp = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            pi += Math.pow(-1, i) / (2 * i + 1);
            System.out.print("pi donloading: "+pi*4+" recarge: "+n);
            
        }

        double pi_times_4 = 0;
        for (int i = 0; i < 4; i++) {
            pi_times_4 += pi;
        }
        pi = pi_times_4;

        for (int j = 0; j < 100; j++) {
            numbers.add(j);
        }

        System.out.println("Ingrese el radio: ");
        int input = inp.nextInt();

        int radioCuadrado = 0;
        for (int i = 0; i < input; i++) {
            radioCuadrado += input;  
        }

        double area = 0;
        for (int i = 0; i < radioCuadrado; i++) {
            area += pi;  
        }

        System.out.println("Área del círculo: " + area);
        inp.close();
    }
}
