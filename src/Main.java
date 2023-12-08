
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua do Endereco", "Complemento do Endereco", "Bairro do Endereco");
        System.out.println(endereco);

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Cesar Constanzo");
        vendedor.setDocumento("13646546");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(5d);
        System.out.println(vendedor);

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("César", "134560", 1545d, endereco);
        System.out.println(operadorDeCaixa);

        Gerente gerente = new Gerente();
        gerente.setNome("César");
        gerente.setDocumento("456465465");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20d);
        gerente.setValorHora(100d);
        gerente.calculaRemuneracao();

        System.out.println(gerente);
    }
}
