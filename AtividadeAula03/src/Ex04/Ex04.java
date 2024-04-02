package Ex04;

public class Ex04 {
	
	public static void main (String[] args) {
		Piano piano = new Piano();
		Violao violao = new Violao();
		
		piano.afinar("Piano");
		piano.tocar("Piano");
		
		violao.afinar("Violao");
		violao.tocar("Violao");
	}
}
