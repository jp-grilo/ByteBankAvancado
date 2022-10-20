public class ControleBonificacao {
    private double soma;

    public void somaBonificacao(Funcionario f) {
        this.soma+=f.getBonificacao();
    }

    public void mostraSoma() {
        System.out.println(soma);
    }
}
