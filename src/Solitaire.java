import java.util.Scanner;

public class Solitaire {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p,k,i;
        int count = 0; //счетчик операций
        System.out.print("Введите количество карт в 1 колоде: ");
        p = in.nextInt();
        if (p<2 || p>=999) {
            System.out.println("Ошибка");
        }
        else {
            System.out.print("Введите количество карт в последней колоде: ");
            k = in.nextInt();
            if (k<=p || k>=1000) {
                System.out.println("Ошибка");
            }
            else {
                for (i = p; i <= k; i++) {
                    int x = i;//зачем надо вводить новую переменную х, которая приравнена к i? без этой строки не выводится команда println
                    while (x != 2) {
                        if (x % 2 == 0) {
                            x /= 2;
                        } else {
                            x = x * 3 + 1;
                        }
                        count++;
                    }
                }
                System.out.println("Операций " + count);
            }
        }
    }
}