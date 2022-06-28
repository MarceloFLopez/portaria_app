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
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "cpf" }) })
@NamedQueries({ @NamedQuery(name = "TabPessoa.listAll", query = "SELECT t FROM TabPessoa t"),
		@NamedQuery(name = "TabPessoa.findColumName", query = "SELECT t FROM TabPessoa t WHERE t.name = :name"),
		@NamedQuery(name = "TabPessoa.findColumnCpf", query = "SELECT t FROM TabPessoa t WHERE t.cpf = :cpf"), })
public class TabPessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String telefone;
	private String cpf;

	public TabPessoa(Long id, String name, String telefone, String cpf) {
		this.id = id;
		this.name = name;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	public TabPessoa() {
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
		return "TabPessoa [id=" + id + ", name=" + name + ", telefone=" + telefone + ", cpf=" + cpf + "]";
	}

}
