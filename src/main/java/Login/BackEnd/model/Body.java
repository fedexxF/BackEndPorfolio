package Login.BackEnd.model;

import javax.persistence.*;

@Entity
public class Body {

    @Id
    @Column(name = "idBody",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBody;
    private String descripcion;
    private String descripcion1;
    private String descripcion2;

    public Body() {
    }

    public Body(Long idBody, String descripcion, String descripcion1, String descripcion2, String fotoBackgorund) {
        this.idBody = idBody;
        this.descripcion = descripcion;
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
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

    public String getDescripcion1() {
        return descripcion1;
    }

    public void setDescripcion1(String descripcion1) {
        this.descripcion1 = descripcion1;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }


}
