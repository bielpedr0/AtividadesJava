package RedeSocial;

public class Main {
    public static void main(String[] args) {
    	
        UsuarioAdmin admin = new UsuarioAdmin("admin", "senha", "admin@example.com");
        Usuario usuario1 = new Usuario("Gabriel", "1234", "Biel@example.com");
        UsuarioPremium usuarioPremium = new UsuarioPremium("Tiago", "4321", "Tiago@example.com");

        usuario1.criarPostagem("Essa é minha primeira postagem!");
        usuarioPremium.criarPostagemDestaque("Postagem de destaque da Maria!");

        Postagem postagem1 = usuario1.getPerfil().getPostagens().get(0);
        UsuarioAdmin.adicionarPostagem(postagem1);
        UsuarioAdmin.adicionarUsuario(usuario1);
        UsuarioAdmin.adicionarUsuario(usuarioPremium);
        
        postagem1.curtir();
        postagem1.curtir();
        postagem1.comentar("Ótimo post! :D");
        postagem1.comentar("Não gostei! >:( ");

        System.out.println("Postagem: " + postagem1.getConteudo());
        System.out.println("Curtidas: " + postagem1.getCurtidas());
        System.out.println("Comentários: " + postagem1.getComentarios());
    }
}

