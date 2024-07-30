package stringbuilder;

public class RemoverVogais {
	public static void main(String[] args) {
        String s = "Olá Mundo!";
        String resultado = removerVogais(s);
        System.out.println("String sem vogais: " + resultado);
    }

    public static String removerVogais(String s) {
        StringBuilder sb = new StringBuilder();
        String vogais = "AEIOUaeiouáéíóúàéìòúÁÉÍÓÚÀÈÌÒÙ";
        for (char c : s.toCharArray()) {
            if (vogais.indexOf(c) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
