import java.util.Random;

public class main {
    public static void main(String[] args) {

        System.out.println(toCamelCase("@ola caracola"));

        System.out.println(invertirString(""));

        System.out.println(ponerEspacios("asdgsdg   asdasd sd"));


    }
    /**
     * Convierte un string en formato mayuscula y minuscula inetrcaladas,
     * la primera siempre sera mayuscula
     *
     * @param string El input del string
     * @return Una version con mayuscula y minuscula intercalda del input.
     */
    public static String toCamelCase(String string) {

        StringBuilder resultado = new StringBuilder();

        boolean toUpperCase = true;

        for (int contador = 0; contador < string.length(); contador++) {

            char c = string.charAt(contador);
            if (Character.isLetter(c)) {
                if (toUpperCase) {
                    c = Character.toUpperCase(c);
                } else {
                    c = Character.toLowerCase(c);
                }
                toUpperCase = !toUpperCase;
            }
            resultado.append(c);
        }
        return resultado.toString();
    }
    /**
     * Invierte el string dado
     *
     * @param string El input del string
     * @return Devuelve un string como el de input pero invertido
     */
    public static String invertirString(String string) {
        String invertida = "";
        for (int contador = string.length() - 1; contador >= 0; contador--) {
            invertida += string.charAt(contador);
        }
        return invertida;
    }
    /**
     * Pone espacios en cada caracter del string dado por parametro
     *
     * @param  string El input del string
     * @return Devuelve un string como el de input pero espaciado entre cada caracter
     */
    public static String ponerEspacios(String string) {
        String resultado = "";
        for (int contador = 0; contador < string.length(); contador++) {
            resultado += string.charAt(contador) + " ";
        }
        return resultado.trim();
    }



}
