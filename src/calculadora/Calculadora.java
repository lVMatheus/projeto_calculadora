/**
 * <p><strong>Projeto Calculadora</strong></p>
 *
 * <p>Esta classe disponibiliza operações matemáticas fundamentais, como adição,
 * subtração, multiplicação e divisão. Também inclui um método responsável por
 * selecionar automaticamente qual operação executar conforme o operador recebido.</p>
 *
 * <p>Este projeto serve como base para estudos envolvendo:</p>
 * <ul>
 *     <li>Análise estática de código (caixa branca)</li>
 *     <li>Técnicas de revisão de código</li>
 *     <li>Práticas de refatoração em Java</li>
 *     <li>Uso correto de documentação com Javadoc</li>
 * </ul>
 *
 * <p>Após a melhoria do código, todos os métodos passaram a ser <strong>funções puras</strong>,
 * ou seja, não modificam estado externo, tornando o código mais limpo e facilitando a criação de testes.</p>
 *
 * @author Seu Nome
 * @version 1.0
 */

package src.calculadora;

public class Calculadora {

    /**
     * Realiza a soma entre dois valores inteiros.
     *
     * @param a primeiro valor
     * @param b segundo valor
     * @return resultado da adição entre {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Executa a operação de subtração entre dois inteiros.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Efetua a multiplicação entre dois números inteiros.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza uma divisão inteira entre os valores informados.
     * Caso o divisor seja zero, uma exceção é lançada.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é permitido dividir por zero.");
        }
        return a / b;
    }

    /**
     * <p>Responsável por identificar e executar a operação matemática adequada
     * conforme o operador fornecido pelo usuário.</p>
     *
     * <p>Operadores disponíveis:</p>
     * <ul>
     *     <li>"+": Adição</li>
     *     <li>"-": Subtração</li>
     *     <li>"*": Multiplicação</li>
     *     <li>"/": Divisão</li>
     * </ul>
     *
     * <p>Qualquer operador que não pertença à lista acima irá gerar uma exceção.</p>
     *
     * @param a primeiro número
     * @param b segundo número
     * @param operador caractere que determina qual operação será realizada
     * @return o valor resultante da operação escolhida
     *
     * @throws IllegalArgumentException caso o operador informado não seja válido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador não reconhecido: " + operador);
        };
    }
}
