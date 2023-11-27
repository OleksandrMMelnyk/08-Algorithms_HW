
/*Протягом семи днів фіксувалась щоденна різна ціна товару.
За допомогою алгоритму Bubble sort реалізуйте функціонал,
який сортує значення цін в зростаючому порядку.
Також реалізуйте функціонал, який розраховує середню ціну
за весь період.
* */

package app;

public class Main {

    public static void main(String[] args) {
        double[] price = {9.65, 13.80, 10.15, 2.55, 23.25, 16.20, 5.25};
        for (int i = 0; i < price.length; i++) {
            for (int j = 1; j < (price.length - i); j++) {
                if (price[j - 1] > price[j]) {
                    double temp = price[j - 1];
                    price[j - 1] = price[j];
                    price[j] = temp;
                }
            }
        }
        System.out.println("Sorted prices:");
        for (double number : price)
            System.out.print(number + " ");
        double sum = 0;
        for (double x : price) {
            sum += x;
        }
        System.out.print("\n--------------------------------------" +
                "\nThe average price for period is EUR: " + sum / price.length);
    }
}
