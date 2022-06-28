package br.com.portaria.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "TabOperacao.listAll", query = "SELECT t FROM TabOperacao t"),
		@NamedQuery(name = "TabOperacao.findColumName", query = "SELECT t FROM TabOperacao t WHERE t.name = :name") })
public class TabOperacao implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String obervacao;
	public TabOperacao(Long id, String name, String obervacao) {
		super();
		this.id = id;
		this.name = name;
		this.obervacao = obervacao;
	}
	public TabOperacao() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getObervacao() {
		return obervacao;
	}
	public void setObervacao(String obervacao) {
		this.obervacao = obervacao;
	}
	@Override
	public String toString() {
		return "TabOperacao [id=" + id + ", name=" + name + ", obervacao=" + obervacao + "]";
	}

	
}
