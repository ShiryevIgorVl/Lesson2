
public class Less2 {

    public static void inverArr () {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == 1) {
                arr [i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(arr);
    }

    public static void complArr() {
        int [] arr = new int[8];
        for (int i = 0; i <= arr.length ; i++) {
            arr[i+1] = arr[i] + 3;
        }
        System.out.println(arr);
    }
}
