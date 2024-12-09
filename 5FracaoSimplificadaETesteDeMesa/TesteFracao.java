public class TesteFracao {
    public static void main(String[] args) {
        //exemplo 1: 2/5 + 3/7
        Fracao f1 = new Fracao(2, 5);
        Fracao f2 = new Fracao(3, 7);
        Fracao soma = f1.somar(f2);
        System.out.println(f1 + " + " + f2 + " = " + soma);

        //exemplo 2: 10/3 - 4/3
        Fracao f3 = new Fracao(10, 3);
        Fracao f4 = new Fracao(4, 3);
        Fracao subtracao = f3.subtrair(f4);
        System.out.println(f3 + " - " + f4 + " = " + subtracao);

        //exemplo 3: 5/2 + 7/4
        Fracao f5 = new Fracao(5, 2);
        Fracao f6 = new Fracao(7, 4);
        Fracao soma2 = f5.somar(f6);
        System.out.println(f5 + " + " + f6 + " = " + soma2);

        //exemplo 4: 4/3 - 2/5
        Fracao f7 = new Fracao(4, 3);
        Fracao f8 = new Fracao(2, 5);
        Fracao subtracao2 = f7.subtrair(f8);
        System.out.println(f7 + " - " + f8 + " = " + subtracao2);

        //exemplo 5: 5/2 * (4/3 - 2/5)
        Fracao f9 = new Fracao(5, 2);
        Fracao f10 = new Fracao(4, 3);
        Fracao f11 = new Fracao(2, 5);
        Fracao resultado = f9.multiplicar(f10.subtrair(f11));
        System.out.println(f9 + " * (" + f10 + " - " + f11 + ") = " + resultado);
    }
}
