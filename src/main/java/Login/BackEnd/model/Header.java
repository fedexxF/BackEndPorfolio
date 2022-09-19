package Login.BackEnd.model;

import javax.persistence.*;

@Entity
public class Header {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idHeader",nullable = false)
    private Long idHeader;
    private String FotoArgentinaPrograma;
    private String FotoUsuarioGithub;

    public Header() {
    }

    public Header(Long idHeader, String fotoArgentinaPrograma, String fotoUsuarioGithub) {
        this.idHeader = idHeader;
        FotoArgentinaPrograma = fotoArgentinaPrograma;
        FotoUsuarioGithub = fotoUsuarioGithub;
    }

    public Long getIdHeader() {
        return idHeader;
    }

    public void setIdHeader(Long idHeader) {
        this.idHeader = idHeader;
    }

    public String getFotoArgentinaPrograma() {
        return FotoArgentinaPrograma;
    }

    public void setFotoArgentinaPrograma(String fotoArgentinaPrograma) {
        FotoArgentinaPrograma = fotoArgentinaPrograma;
    }

    public String getFotoUsuarioGithub() {
        return FotoUsuarioGithub;
    }

    public void setFotoUsuarioGithub(String fotoUsuarioGithub) {
        FotoUsuarioGithub = fotoUsuarioGithub;
    }
}

