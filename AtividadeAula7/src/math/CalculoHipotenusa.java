package math;

public class CalculoHipotenusa {
	public static void main(String[] args) {
        double catetoA = 3.0;
        double catetoB = 4.0;
        double hipotenusa = calcularHipotenusa(catetoA, catetoB);
        System.out.println("A hipotenusa é: " + hipotenusa);
    }

    public static double calcularHipotenusa(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
}
