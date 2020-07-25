public class Cycle {	
    public static void main(String[] args) {

        for (int i = 0;i <= 20;i++) {
            System.out.println(i);
        }

        System.out.println("------");

        int s = 6;

        while (s >= -6) {
            System.out.println(s);
            s = s-2;
        }

        System.out.println("------");

        int cnt = 0;
        int r = 10;

        do {
            if (r % 2 != 0) {
                cnt = cnt + r;
            }
            r++;
        } while (r <= 20);

        /*Сумма нечетных чисел от 10 до 20*/
        System.out.println(cnt);

    }
}