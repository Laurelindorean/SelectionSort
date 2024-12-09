package ioc.xtec.cat.selectionsort;

/**
 * Implemantació de l'ordenació i comprovació dels nombres
 *
 * @author Palmira Romia Segura
 * @version 1.0
 */
public class ArrayValidator {

    /**
     * Funció que valida si l'array rebut per paràmetre es troba buit o es null
     * en cas contrari llança una excepció
     *
     * @param arr array introduït per l'usuari
     */
    public void validateArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit.");
        }
    }

}
