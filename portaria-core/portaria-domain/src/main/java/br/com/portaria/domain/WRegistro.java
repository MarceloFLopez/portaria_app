package br.com.portaria.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "WRegistro.listAll", query = "SELECT t FROM WRegistro t") })
public class WRegistro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date;

	@ManyToOne
	@JoinColumn
	private Usuario usuario;

	@ManyToOne
	@JoinColumn
	private TabCadastro cadastro;

	public WRegistro() {
	}

	public WRegistro(Long id, Date date, Usuario usuario, TabCadastro cadastro) {
		this.id = id;
		this.date = date;
		this.usuario = usuario;
		this.cadastro = cadastro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TabCadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(TabCadastro cadastro) {
		this.cadastro = cadastro;
	}

	@Override
	public String toString() {
		return "WRegistro [id=" + id + ", date=" + date + ", usuario=" + usuario + ", cadastro=" + cadastro + "]";
	}

}
