public class Fracao {
    private int numerador;
    private int denominador;

    //construtor
    public Fracao(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    //metodo para calcular o MDC (Máximo Divisor Comum)
    private int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //metodo para simplificar a fração
    private void simplificar() {
        int divisorComum = mdc(numerador, denominador);
        numerador /= divisorComum;
        denominador /= divisorComum;

        //garante que o denominador seja positivo
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
    }

    //metodo para somar frações
    public Fracao somar(Fracao outra) {
        int num = this.numerador * outra.denominador + outra.numerador * this.denominador;
        int den = this.denominador * outra.denominador;
        return new Fracao(num, den);
    }

    //metodo para subtrair frações
    public Fracao subtrair(Fracao outra) {
        int num = this.numerador * outra.denominador - outra.numerador * this.denominador;
        int den = this.denominador * outra.denominador;
        return new Fracao(num, den);
    }

    //metodo para multiplicar frações
    public Fracao multiplicar(Fracao outra) {
        int num = this.numerador * outra.numerador;
        int den = this.denominador * outra.denominador;
        return new Fracao(num, den);
    }

    //metodo para dividir frações
    public Fracao dividir(Fracao outra) {
        if (outra.numerador == 0) {
            throw new ArithmeticException("Não é possível dividir por uma fração com numerador igual a zero.");
        }
        int num = this.numerador * outra.denominador;
        int den = this.denominador * outra.numerador;
        return new Fracao(num, den);
    }

    //metodo para exibir a fração como string
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    //metodo main para testar diretamente a classe Fracao
    public static void main(String[] args) {
        //teste de mesa direto na classe principal
        Fracao f1 = new Fracao(2, 5);
        Fracao f2 = new Fracao(3, 7);
        Fracao soma = f1.somar(f2);
        System.out.println(f1 + " + " + f2 + " = " + soma);

        Fracao f3 = new Fracao(10, 3);
        Fracao f4 = new Fracao(4, 3);
        Fracao subtracao = f3.subtrair(f4);
        System.out.println(f3 + " - " + f4 + " = " + subtracao);

        Fracao f5 = new Fracao(5, 2);
        Fracao f6 = new Fracao(7, 4);
        Fracao soma2 = f5.somar(f6);
        System.out.println(f5 + " + " + f6 + " = " + soma2);

        Fracao f7 = new Fracao(4, 3);
        Fracao f8 = new Fracao(2, 5);
        Fracao subtracao2 = f7.subtrair(f8);
        System.out.println(f7 + " - " + f8 + " = " + subtracao2);

        Fracao f9 = new Fracao(5, 2);
        Fracao f10 = new Fracao(4, 3);
        Fracao f11 = new Fracao(2, 5);
        Fracao resultado = f9.multiplicar(f10.subtrair(f11));
        System.out.println(f9 + " * (" + f10 + " - " + f11 + ") = " + resultado);
    }
}
