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
        simplificar(); //simplifica a fração ao ser criada
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
        //garabte enominador seja sempre positivo
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
    }

    //metospara somar frações
    public Fracao somar(Fracao outra) {
        int num = this.numerador * outra.denominador + outra.numerador * this.denominador;
        int den = this.denominador * outra.denominador;
        return new Fracao(num, den);
    }

    // Método para subtrair frações
    public Fracao subtrair(Fracao outra) {
        int num = this.numerador * outra.denominador - outra.numerador * this.denominador;
        int den = this.denominador * outra.denominador;
        return new Fracao(num, den);
    }

    // Método para multiplicar frações
    public Fracao multiplicar(Fracao outra) {
        int num = this.numerador * outra.numerador;
        int den = this.denominador * outra.denominador;
        return new Fracao(num, den);
    }

    // Método para dividir frações
    public Fracao dividir(Fracao outra) {
        if (outra.numerador == 0) {
            throw new ArithmeticException("Não é possível dividir por uma fração com numerador igual a zero.");
        }
        int num = this.numerador * outra.denominador;
        int den = this.denominador * outra.numerador;
        return new Fracao(num, den);
    }

    // Método para exibir a fração como string
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    // Método para testar a classe
    public static void main(String[] args) {
        // Exemplo 1: 2/5 + 3/7
        Fracao f1 = new Fracao(2, 5);
        Fracao f2 = new Fracao(3, 7);
        Fracao soma = f1.somar(f2);
        System.out.println(f1 + " + " + f2 + " = " + soma);

        // Exemplo 2: 10/3 - 4/3
        f1 = new Fracao(10, 3);
        f2 = new Fracao(4, 3);
        Fracao subtracao = f1.subtrair(f2);
        System.out.println(f1 + " - " + f2 + " = " + subtracao);

        // Exemplo 3: 5/2 + 7/4
        f1 = new Fracao(5, 2);
        f2 = new Fracao(7, 4);
        Fracao soma2 = f1.somar(f2);
        System.out.println(f1 + " + " + f2 + " = " + soma2);

        // Exemplo 4: 4/3 - 2/5
        f1 = new Fracao(4, 3);
        f2 = new Fracao(2, 5);
        Fracao subtracao2 = f1.subtrair(f2);
        System.out.println(f1 + " - " + f2 + " = " + subtracao2);

        // Exemplo 5: 5/2 * (4/3 - 2/5)
        f1 = new Fracao(5, 2);
        Fracao sub = f1.subtrair(f2);
        Fracao multiplicacao = f1.multiplicar(sub);
        System.out.println(f1 + " * (" + f2 + " - " + f1 + ") = " + multiplicacao);
    }
}
