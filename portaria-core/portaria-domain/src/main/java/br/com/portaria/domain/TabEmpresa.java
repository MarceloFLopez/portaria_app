package br.com.portaria.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "cnpj" }) })
@NamedQueries({ @NamedQuery(name = "TabEmpresa.listAll", query = "SELECT t FROM TabEmpresa t"),
	        	@NamedQuery(name = "TabEmpresa.findColumnName", query = "SELECT t FROM TabEmpresa t WHERE t.name = :name" ) })
public class TabEmpresa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cnpj;
	private String name;

		
	public TabEmpresa() {
	}
	public TabEmpresa( String cnpj, String name) {
		this.cnpj = cnpj;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "TabEmpresa [id=" + id + ", cnpj=" + cnpj + ", name=" + name + "]";
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
		TabEmpresa other = (TabEmpresa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
