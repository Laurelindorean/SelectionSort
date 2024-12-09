package ioc.xtec.cat.selectionsort;

/**
 * Implemantació de l'ordenació i comprovació dels nombres
 *
 * @author Palmira Romia Segura
 * @version 1.0
 */
public class SelectionSort {

    /**
     * Mètode que rep un array, i l'ordena de forma ascendent
     *
     * @param arr array introduït per l'usuari
     */
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Mètode que rep 2 paràmetres d'entrada, un array d'enters que comprova que
     * no sigui null i un nombre i retornarà un booleà.
     *
     * @param arr array introduït per l'usuari
     * @param value valor introduït per l'usuari
     * @return retorna un valor true o false depenent de si el nombre existeix a
     * l'array o no
     */
    public boolean contains(int[] arr, int value) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

}
