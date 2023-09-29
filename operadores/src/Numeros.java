public class Numeros {
    public static void main(String[] args) {
        int numero = 10;
        numero = - numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        numero++;
        System.out.println(numero);
        System.out.println(++ numero);

        boolean variavel = true;
        System.out.println(!variavel);

        int a, b;
        a = 2;
        b = 2;

        String resultado = a==b ?"Verdadeiro":"Falso";

        System.out.println(resultado);
    }
}
