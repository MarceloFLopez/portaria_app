package br.com.portaria.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = "TabPessoa.listAll", query = "SELECT t FROM TabPessoa t"),
		@NamedQuery(name = "TabPessoa.name", query = "SELECT t FROM TabPessoa t WHERE t.name = :name") })
public class TabPessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String cpf;

	private TabEmpresa tabEmpresa;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public TabEmpresa getTabEmpresa() {
		return tabEmpresa;
	}

	public void setTabEmpresa(TabEmpresa tabEmpresa) {
		this.tabEmpresa = tabEmpresa;
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
		TabPessoa other = (TabPessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TabPessoa [id=" + id + ", name=" + name + ", cpf=" + cpf + ", tabEmpresa=" + tabEmpresa + "]";
	}

}
