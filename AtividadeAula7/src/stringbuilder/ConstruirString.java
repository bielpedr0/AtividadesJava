package stringbuilder;

public class ConstruirString {
	public static void main(String[] args) {
        String[] palavras = {"Olá", "Mundo", "Java"};
        String resultado = construirString(palavras);
        System.out.println(resultado);
    }

    public static String construirString(String[] palavras) {
        StringBuilder sb = new StringBuilder();
        for (String palavra : palavras) {
            sb.append(palavra).append(" ");
        }
        return sb.toString().trim();
    }

}
