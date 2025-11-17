public class App {

    public static void main(String[] args) throws Exception {
        ShowConsole sC = new ShowConsole();
        BusquedaBinaria bB = new BusquedaBinaria();
        int[] arr = new  int [] {10, 2, 4, 6, 7, 8, 13, 20};
        Integer result = bB.busquedaBinaria(arr, 10);
    }
    
}
