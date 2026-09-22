package _3POB.Exercicios09;

public class Exercicio03 {
    public static void main(String[] args) {

        Usuario usuario =
                new Usuario("joao", "1234");

        Administrador administrador =
                new Administrador(
                        "admin",
                        "admin123",
                        5
                );

        System.out.println("Usuário:");
        System.out.println(
                "Autenticado: "
                + usuario.autenticar("1234")
        );

        System.out.println();

        System.out.println("Administrador:");
        System.out.println(
                "Autenticado: "
                + administrador.autenticar("admin123")
        );

        System.out.println(
                "JSON: "
                + administrador.exportarJSON()
        );
    }
}

interface Autenticavel {

    boolean autenticar(String senha);
}

interface ExportavelJSON {

    String exportarJSON();
}

class Usuario implements Autenticavel {
    protected String login;
    protected String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}

class Administrador
        implements Autenticavel, ExportavelJSON {

    private String login;
    private String senha;
    private int nivelAcesso;

    public Administrador(
            String login,
            String senha,
            int nivelAcesso) {

        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public String exportarJSON() {
        return "{"
                + "\"login\":\"" + login + "\","
                + "\"nivelAcesso\":" + nivelAcesso
                + "}";
    }
}
