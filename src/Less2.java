import java.util.Arrays;

public class Less2 {

    public static void inverArr(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
      //  System.out.println(Arrays.toString(arr));
    }

    public static void complArr(String[] args) {
        int[] arr = new int[8];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + 3;
        }
      //  System.out.println(Arrays.toString(arr));
    }

    public static void lesSixmultiplybytwoArr(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
       // System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) //Второй цикл только для печати
            {
                arr[i][i] = 1;
                arr[i][arr.length - 1 - i] = 1;
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println();
            }

        }

    }

