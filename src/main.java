public class main {

    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        f.setNome("Laerte");
        f.setSalario(150);

        Gerente g = new Gerente();
        g.setNome("Cleber");
        g.setSalario(300);
        g.setSenha(1234);
        g.autenticacao(1234);

        EditorDeVideo edv = new EditorDeVideo();
        edv.setSalario(200);

        ControleBonificacao controle = new ControleBonificacao();
        controle.somaBonificacao(f);
        controle.somaBonificacao(g);
        controle.somaBonificacao(edv);

        controle.mostraSoma();


    }
}
