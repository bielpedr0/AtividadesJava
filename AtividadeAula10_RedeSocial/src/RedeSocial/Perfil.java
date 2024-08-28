package RedeSocial;
import java.util.ArrayList;
import java.util.List;

public class Perfil {
    private String biografia;
    private String fotoDePerfil;
    private List<Postagem> postagens;

    public Perfil() {
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Postagem postagem) {
        postagens.add(postagem);
    }

    public List<Postagem> getPostagens() {
        return postagens;
    }
    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getFotoDePerfil() {
        return fotoDePerfil;
    }

    public void setFotoDePerfil(String fotoDePerfil) {
        this.fotoDePerfil = fotoDePerfil;
    }
}