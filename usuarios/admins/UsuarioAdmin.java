package usuarios.admins;

public class UsuarioAdmin extends usuarios.Usuario {
    public UsuarioAdmin(String nome, int idade, String CPF, String telefone, String CEP, String codigoFuncionario) {
        super(nome, idade, CPF, telefone, CEP);
        this.admin = true;
        this.codigoFuncionario = codigoFuncionario;
    }

    private String codigoFuncionario;

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
}
