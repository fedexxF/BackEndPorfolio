package Login.BackEnd.model;

import javax.persistence.*;

@Entity
public class Experiencia {
    @Id
    @Column(name = "idExp", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    public String tituloExp;
    public String fechaExp;
    public String descExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, String fechaExp, String descExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaExp = fechaExp;
        this.descExp = descExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

    public String getDescExp() {
        return descExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }
}



