package stringbuilder;

public class InserirString {
	 public static void main(String[] args) {
	        String original = "Olá, !";
	        String paraInserir = "Mundo";
	        int posicao = 5;
	        String resultado = inserirString(original, paraInserir, posicao);
	        System.out.println("Resultado: " + resultado);
	    }

	    public static String inserirString(String original, String paraInserir, int posicao) {
	        StringBuilder sb = new StringBuilder(original);
	        sb.insert(posicao, paraInserir);
	        return sb.toString();
	    }
}
