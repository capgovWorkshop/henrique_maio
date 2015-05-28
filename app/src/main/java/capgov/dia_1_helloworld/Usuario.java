package capgov.dia_1_helloworld;

import java.io.Serializable;

/**
 * Created by Pesc on 28/05/2015.
 */
public class Usuario implements Serializable {
    String nome;
    String senha;

    public static final String TABLE = "usuario";
    public static final String KEY_ID = "id";
    public static final String KEY_USUARIO = "usuario";
    public static final String KEY_SENHA = "senha";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

}
