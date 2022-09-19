package Login.BackEnd.model;

import javax.persistence.*;

@Entity
public class Educacion {
    @Id
    @Column(name = "idEdu", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;

    public Educacion() {
    }
    public String ActividadEdu;
    public String FechaEdu;
    public String LugarEdu;


    public Educacion(Long idEdu, String actividadEdu, String fechaEdu, String lugarEdu) {
        this.idEdu = idEdu;
        ActividadEdu = actividadEdu;
        FechaEdu = fechaEdu;
        LugarEdu = lugarEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getActividadEdu() {
        return ActividadEdu;
    }

    public void setActividadEdu(String actividadEdu) {
        ActividadEdu = actividadEdu;
    }

    public String getFechaEdu() {
        return FechaEdu;
    }

    public void setFechaEdu(String fechaEdu) {
        FechaEdu = fechaEdu;
    }

    public String getLugarEdu() {
        return LugarEdu;
    }

    public void setLugarEdu(String lugarEdu) {
        LugarEdu = lugarEdu;
    }
}




