class ContaBancariaSimples {
    String nomeDoCorrentista;
    float saldo;
    boolean contaÉEspecial;

    void abreContaSimples(String nome, float valor) {
        if (valor < 100) {
            System.out.println("Valor mínimo para abrir uma conta é R$100,00.");
        } else {
            nomeDoCorrentista = nome;
            saldo = valor;
            contaÉEspecial = false;
        }
    }

    void deposita(float valor) {
        saldo = saldo + valor;
    }

    boolean retira(float valor) {
        if (contaÉEspecial == false) {
            if (valor <= saldo) {
                saldo = saldo - valor;
                return true;
            } else {
                return false;
            }
        } else {
            saldo = saldo - valor;
            return true;
        }
    }

    void mostraDados() {
        System.out.print("O nome do correntista é ");
        System.out.print(nomeCorrentista);
        System.out.print("O saldo é ");
        System.out.print(saldo);
        if (contaEEspecial) {
            if (saldo < 0) {
                System.out.print("Seu saldo está negativo! Cuidado!");
            }
            System.out.print("A conta é especial.");
        } else {
            System.out.print("A conta é comum.");
        }
    }
}