//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instanciando o objeto funcionarioHorista e passando o valor total anual do funcionario
        Funcionario funcionarioHorista = new FuncionarioHorista(40000);

        //retorno do valor anual + bonus
        System.out.println("Bônus do Funcionário Horista: R$ " + funcionarioHorista.calcularBonus());
        //retorno fixo funcionario assalariado
        Funcionario funcionarioAssalariado = new FuncionarioAssalariado();
        System.out.println("Bônus do Funcionário Assalariado: R$ " + funcionarioAssalariado.calcularBonus());



    }
}