# resolução

### BM 1- Lampada

Dados: acesa: boolean potenciaDaLampada: double

Operações: acender: void apagar: void estaAcesa: boolean

### BM 2:
TimeDeEsporte

Dados: nomeDoTime: string numJogadores: int jogadores: string[] nomeDotreinador: string

Operações: mudarNome(string): void substituirTreinador(string): void adicionarJogadorNaPosicao(String, int): void

### BM 3:
Classe ContaBancariaSimples

### BM 4:
Classe Lampada

### BM 5:
Classe TimeDeEsporte

### BM 6: 
Classe ContaBancariaSimples

### BM 7:
o nome da classe não deve possuir espaços. Deveria ser:

class RegistroDeEleitor

### BM 8:
O método maior apesar de não dar erro de compilação, tinha que retornar boolean e não item, já que seus retornos são apenas true or false. Correção:

boolean maior() { if (num1 > num2) return true; else return false; }

O método menor dará erro de compilação, porque está assinado para não possuir retorno e está retornando int. Correção:

int menor() { if (num1 < num2) return num1; else return num2; }

### BM 9:
Assinatura método main está errada. Correção:

public static void main(String[] args)

E o método main não deve possuir retorno, afinal possui assinatura void.

