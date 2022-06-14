package br.com.portaria.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_operacao")
@NamedQueries({ @NamedQuery(name = "TabOperacao.listAll", query = "SELECT t FROM TabOperacao t"),
				@NamedQuery(name = "TabOperacao.findColumName", query = "SELECT t FROM TabOperacao t WHERE t.name = :name") })
public class TabOperacao implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Date data;
	
	public TabOperacao() {
	}
	public TabOperacao(String name, Date data) {
		this.name = name;
		this.data = data;
	}

	
	public TabOperacao(Long id, String name, Date data) {
		this.id = id;
		this.name = name;
		this.data = data;
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TabOperacao other = (TabOperacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TabOperacao [id=" + id + ", name=" + name + ", data=" + data + "]";
	}

}
