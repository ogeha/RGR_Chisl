import java.util.Scanner;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RGR_Chisl {
    public static void main(String[] args) {
        double x, x1, x2, x3, x4, x5, x6, x7, y1, y2, y3, y4, y5, y6, y7, q;
        double h = 0.3;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        x1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        x3 = scanner.nextDouble();
        x4 = scanner.nextDouble();
        x5 = scanner.nextDouble();
        x6 = scanner.nextDouble();
        x7 = scanner.nextDouble();
        y1 = 1/x1;
        y2 = 1/x2;
        y3 = 1/x3;
        y4 = 1/x4;
        y5 = 1/x5;
        y6 = 1/x6;
        y7 = 1/x7;
        q = (x - x4)/h;
        ArrayList<Double> y_1 = new ArrayList<Double>();
        ArrayList<Double> y_2 = new ArrayList<Double>();
        ArrayList<Double> y_3 = new ArrayList<Double>();
        ArrayList<Double> y_4 = new ArrayList<Double>();
        ArrayList<Double> y_5 = new ArrayList<Double>();
        ArrayList<Double> y_6 = new ArrayList<Double>();
        ArrayList<Double> y_7 = new ArrayList<Double>();
        y_1.add(y1);
        y_1.add(y2);
        y_1.add(y3);
        y_1.add(y4);
        y_1.add(y5);
        y_1.add(y6);
        y_1.add(y7);
        for (int i = 0; i < 5; i++){
            y_2.add(y_1.get(i+1) - y_1.get(i));
        }
        for (int i = 0; i < 4; i++){
            y_3.add(y_2.get(i+1) - y_2.get(i));
        }
        for (int i = 0; i < 3; i++){
            y_4.add(y_3.get(i+1) - y_3.get(i));
        }
        for (int i = 0; i < 2; i++){
            y_5.add(y_4.get(i+1) - y_4.get(i));
        }
        for (int i = 0; i < 1; i++) {
            y_6.add(y_5.get(i + 1) - y_5.get(i));
        }
        y_7.add(y_5.get(1) - y_5.get(0));
        double Interpol = y4 + q*(y_2.get(3)) + ((q*(q+1))/2) * (y_3.get(2)) + ((q*(q+1)*(q-1))/6) * (y_4.get(2)) + ((q*(q+1)*(q-1)*(q+2))/24)*y_5.get(1) + ((q*(q-1)*(q+1)*(q-2)*(q+2))/(2*3*4*5)) * y_6.get(0) + ((q*(q-1)*(q+1)*(q-2)*(q+2)*(q-3))/(2*3*4*5*6)) * y_7.get(0);
        System.out.println(Interpol);

    }
}