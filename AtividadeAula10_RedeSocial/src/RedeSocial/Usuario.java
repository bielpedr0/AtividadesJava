package RedeSocial;

public class Usuario {
    private String nomeUsuario;
    private String senha;
    private String email;
    private Perfil perfil;

    public Usuario(String nomeUsuario, String senha, String email) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.email = email;
        this.perfil = new Perfil();
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void criarPostagem(String conteudo) {
        Postagem postagem = new Postagem(this, conteudo);
        perfil.adicionarPostagem(postagem);
    }
}
