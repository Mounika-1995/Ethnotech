import java.util.Scanner;
class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[30];
        int high = 0, low = 100, sum = 0, hot = 0;
        for (int i = 0; i < 30; i++) {
            t[i] = sc.nextInt();
            if (t[i] > high)
                high = t[i];
            if (t[i] < low)
                low = t[i];
            if (t[i] > 35)
                hot++;
            sum += t[i];
        }
        System.out.println("High Temp : " + high);
        System.out.println("Low Temp : " + low);
        System.out.println("Average : " + (sum / 30.0));
        System.out.println("Hot Days : " + hot);
    }
}