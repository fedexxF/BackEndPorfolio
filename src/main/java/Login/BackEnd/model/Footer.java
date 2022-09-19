package Login.BackEnd.model;

import javax.persistence.*;

@Entity
public class Footer {
    @Id
    @Column(name = "idFooter",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFooter;
    private String descripcion;

    public Footer() {
    }

    public Footer(Long idFooter, String descripcion) {
        this.idFooter = idFooter;
        this.descripcion = descripcion;
    }

    public Long getIdFooter() {
        return idFooter;
    }

    public void setIdFooter(Long idFooter) {
        this.idFooter = idFooter;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
