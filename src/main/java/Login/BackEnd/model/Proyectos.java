package Login.BackEnd.model;

import javax.persistence.*;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idProyectos",nullable = false)
    private Long idProyectos;
    public String descripcion;

    public Proyectos(String descripcion) {
        this.descripcion = descripcion;
    }

    public Proyectos() {
    }

    public Long getIdProyectos() {
        return idProyectos;
    }

    public void setIdProyectos(Long idProyectos) {
        this.idProyectos = idProyectos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}


