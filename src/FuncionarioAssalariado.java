
public class FuncionarioAssalariado implements Funcionario  {
    @Override
    // Sobrescreve o método calcularBonus para retornar o valor fixo de bônus de um funcionário assalariado
    public double calcularBonus() {
        return 5000.00; // Bônus fixo de R$ 5.000,00
    }
}
