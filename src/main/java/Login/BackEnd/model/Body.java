package Login.BackEnd.model;

import javax.persistence.*;

@Entity
public class Body {

    @Id
    @Column(name = "idBody",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBody;
    private String descripcion;

    public Body() {
    }

    public Body(Long idBody, String descripcion, String descripcion1, String descripcion2, String fotoBackgorund) {
        this.idBody = idBody;
        this.descripcion = descripcion;

    }

    public Long getIdBody() {
        return idBody;
    }

    public void setIdBody(Long idBody) {
        this.idBody = idBody;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



}
