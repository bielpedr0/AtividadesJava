package RedeSocial;
import java.util.ArrayList;
import java.util.List;

public class Postagem implements Curtivel {
    private Usuario autor;
    private String conteudo;
    private String dataCriacao;
    private int curtidas;
    private List<String> comentarios;

    public Postagem(Usuario autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.dataCriacao = java.time.LocalDateTime.now().toString();
        this.curtidas = 0;
        this.comentarios = new ArrayList<>();
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }
    
    @Override
    public void curtir() {
        curtidas++;
    }

    @Override
    public int getCurtidas() {
        return curtidas;
    }

    public void comentar(String comentario) {
        comentarios.add(comentario);
    }

    public List<String> getComentarios() {
        return comentarios;
    }
}
