package RedeSocial;

public class UsuarioPremium extends Usuario {
	
    public UsuarioPremium(String nomeUsuario, String senha, String email) {
        super(nomeUsuario, senha, email);
    }

    public void criarPostagemDestaque(String conteudo) {
        Postagem postagem = new Postagem(this, conteudo);
        getPerfil().adicionarPostagem(postagem);
    }
}