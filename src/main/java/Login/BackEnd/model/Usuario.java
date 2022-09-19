package Login.BackEnd.model;

import javax.persistence.*;
import java.io.Serializable;

import java.util.List;

@Entity
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;
	private String titulo;
	private String email;
	private String password;
	private String descripcion;
	private String fotoPerfil;


	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idBody")
	private List<Body> bodyList;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "idEdu")
	private List<Educacion> educacionsList;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "idExp")
	private List<Experiencia> experienciasList;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "idFooter")
	private List<Footer> footerList;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "idHab")
	private List<Habilidad> habilidadesList;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "idHome")
	private List<Home> homesList;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "idProyectos")
	private List<Proyectos> proyectosList;




	public Usuario(Long id, String nombre, String apellido, String titulo, String email, String password, String descripcion, String fotoPerfil) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.titulo = titulo;
		this.email = email;
		this.password = password;
		this.descripcion = descripcion;
		this.fotoPerfil = fotoPerfil;

	}

	public Usuario() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFotoPerfil() {
		return fotoPerfil;
	}

	public void setFotoPerfil(String fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}

}
