package Login.BackEnd.model;

import javax.persistence.*;

@Entity
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idHome",nullable = false)
    private Long idHome;
    public String TituloHome;
    public String  SubTituloHome;
    public String NombreHome;

    public Home() {
    }

    public Home(Long idHome, String tituloHome, String subTituloHome, String nombreHome) {
        this.idHome = idHome;
        TituloHome = tituloHome;
        SubTituloHome = subTituloHome;
        NombreHome = nombreHome;


    }

    public Long getIdHome() {
        return idHome;
    }

    public void setIdHome(Long idHome) {
        this.idHome = idHome;
    }

    public String getTituloHome() {
        return TituloHome;
    }

    public void setTituloHome(String tituloHome) {
        TituloHome = tituloHome;
    }

    public String getSubTituloHome() {
        return SubTituloHome;
    }

    public void setSubTituloHome(String subTituloHome) {
        SubTituloHome = subTituloHome;
    }

    public String getNombreHome() {
        return NombreHome;
    }

    public void setNombreHome(String nombreHome) {
        NombreHome = nombreHome;
    }

}

