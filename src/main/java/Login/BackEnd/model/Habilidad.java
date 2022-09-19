package Login.BackEnd.model;

import javax.persistence.*;

@Entity
public class Habilidad {
    @Id
    @Column(name = "idHab",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idHab;
    private String tituloHab;
    private int porcentajeHab;
    private String descHab;
    private String imagenHab;

    public Habilidad() {
    }

    public Habilidad(Long idHab, String tituloHab, int porcentajeHab, String descHab, String imagenHab) {
        this.idHab = idHab;
        this.tituloHab = tituloHab;
        this.porcentajeHab = porcentajeHab;
        this.descHab = descHab;
        this.imagenHab = imagenHab;
    }

    public Long getIdHab() {
        return idHab;
    }

    public void setIdHab(Long idHab) {
        this.idHab = idHab;
    }

    public String getTituloHab() {
        return tituloHab;
    }

    public void setTituloHab(String tituloHab) {
        this.tituloHab = tituloHab;
    }

    public int getPorcentajeHab() {
        return porcentajeHab;
    }

    public void setPorcentajeHab(int porcentajeHab) {
        this.porcentajeHab = porcentajeHab;
    }

    public String getDescHab() {
        return descHab;
    }

    public void setDescHab(String descHab) {
        this.descHab = descHab;
    }

    public String getImagenHab() {
        return imagenHab;
    }

    public void setImagenHab(String imagenHab) {
        this.imagenHab = imagenHab;
    }
}
