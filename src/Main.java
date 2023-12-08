
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
        System.out.println(vendedor);
    }
}
