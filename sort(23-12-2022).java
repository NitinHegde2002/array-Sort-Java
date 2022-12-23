import java.util.Scanner;
import java.util.Arrays;

class sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of first sorted array");
        int x = scan.nextInt();
        System.out.println("Enter size of second sorted array");
        int y = scan.nextInt();

        int[] a = new int[x];
        int[] b = new int[y];

        System.out.println("Enter the first sorted array");
        for (int i = 0; i < x; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Enter the second sorted array");
        for (int i = 0; i < y; i++) {
            b[i] = scan.nextInt();
        }

        int z = x + y;
        int[] c = new int[z];

        System.arraycopy(a, 0, c, 0, x);
        System.arraycopy(b, 0, c, x, y);

        Arrays.sort(c);

        System.out.println("Sorted Array:\n");
        for (int e = 0; e < z; e++) {
            System.out.print(c[e] + "\t");
        }

        scan.close();
    }
}