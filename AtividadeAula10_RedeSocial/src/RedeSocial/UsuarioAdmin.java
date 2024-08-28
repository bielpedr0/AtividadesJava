package RedeSocial;
import java.util.ArrayList;
import java.util.List;

public class UsuarioAdmin extends Usuario {
	  private static List<Postagem> postagens = new ArrayList<>();
	    private static List<Usuario> usuarios = new ArrayList<>();
	
    public UsuarioAdmin(String nomeUsuario, String senha, String email) {
        super(nomeUsuario, senha, email);
    }
    public static void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public static void adicionarPostagem(Postagem postagem) {
        postagens.add(postagem);
    }

    public void deletarPostagem(Postagem postagem) {
    	   if (postagens.contains(postagem)) {
               postagens.remove(postagem);
               System.out.println("Postagem removida.");
           } else {
               System.out.println("Postagem não encontrada.");
           }
    }

    public void banirUsuario(Usuario usuario) {
    	  if (usuarios.contains(usuario)) {
              usuarios.remove(usuario);
              System.out.println("Usuário banido.");
          } else {
              System.out.println("Usuário não encontrado.");
          }
      }
    }

