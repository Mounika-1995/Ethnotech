import java.util.Scanner;
 class JaggedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[3][];
        m[0] = new int[2];
        m[1] = new int[3];
        ma[2] = new int[4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m.length; i++) {
		System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}