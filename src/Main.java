public class Main {
    public static void main(String[] args) {

        int[] tab = new int[]{1,5,2,3,9,4,2};
        printTab(bobbleSort(tab));
    }
    private static void printTab(int[] tab) {
        for(int elem: tab){
            System.out.print(elem+ " ");
        }
    }
    private static int[] bobbleSort(int[] tab) {
        for(int i = 0; i < tab.length-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < tab.length-1-i; j++) {
                if (tab[j] > tab[j + 1]) {
                    swapped = true;
                    int temp = tab[j + 1];
                    tab[j + 1] = tab[j];
                    tab[j] = temp;
                }
            }
            if(!swapped) return tab;
        }
        return tab;
    }
}