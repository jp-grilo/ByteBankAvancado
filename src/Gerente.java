public class Gerente extends Funcionario{

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autenticacao(int senha){
        if(senha == this.senha){
            System.out.println("Autenticado com sucesso");
            return true;
        }
        System.out.println("Falha na autenticação");
        return false;
    }

    public double getBonificacao(){
        return super.getBonificacao() + super.getSalario();
    }


}
