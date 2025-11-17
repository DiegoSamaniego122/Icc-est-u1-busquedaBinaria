public class Ordenamiento {


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] datos = {10, 2, 4, 6, 7, 8, 13, 20};
        bubbleSort(datos);

        for (int x : datos) {
            System.out.print(x + " ");
        }
    }
}

    

