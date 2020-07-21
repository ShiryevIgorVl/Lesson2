import java.util.Arrays;

public class Less2 {

    public static void inverArr () {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr [i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void complArr() {
        int [] arr = new int[8];
        for (int i = 1; i < arr.length ; i++) {
            arr[i+1] = arr[i] + 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void lesSixmultiplybytwoArr() {
       int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr [i] = arr [i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    }
