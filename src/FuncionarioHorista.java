public class FuncionarioHorista implements Funcionario  {
    private double totalAnual;
    //metodo construtor
    public FuncionarioHorista(double totalAnual) {
        this.totalAnual = totalAnual;
    }
    @Override
    //Sobrescreve o método calcularBonus para retornar o valor anual do salario com bonus de 10%
    public double calcularBonus() {
        return totalAnual * 0.10; // Bônus é 10% do total anual
    }


}
