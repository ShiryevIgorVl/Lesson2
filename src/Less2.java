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
            arr[i] = arr[i - 1] + 3;
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

    public static void diagonalelements1(String[] args) {
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

    public static int maxArr(String[] args) {
        int[] arr = {6, 5, 12, 33, 11, 15, 34, 77};
        int maxArr = arr[0];
        int minArr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxArr <= arr[i]) {
                maxArr = arr[i];
            }
        }
        return maxArr;
    }

    public static int minArr(String[] args) {
        int[] arr = {6, 5, 12, 33, 11, 15, 34, 77};
        int minArr = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (minArr >= arr[i]) {
                minArr = arr[i];
            }
        }
        return minArr;
     }


    }

