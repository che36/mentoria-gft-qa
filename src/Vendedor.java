public class Vendedor extends FuncionarioCLT {
    private Double valorBonificacao;

    @Override
    public String toString() {
        return "Vendedor{" +
                "valorBonificacao=" + valorBonificacao +
                ", nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                '}';
    }
}
