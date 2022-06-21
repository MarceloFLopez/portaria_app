package br.com.portaria.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "TabCadastro.listAll", query = "SELECT t FROM TabCadastro t")})
public class TabCadastro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(nullable = false)
	private TabEmpresa empresa;

	@ManyToOne
	@JoinColumn(nullable = false)
	private TabOperacao operacao;

	@ManyToOne
	@JoinColumn(nullable = false)
	private TabTransporte transporte;

	@ManyToOne
	@JoinColumn(nullable = false)
	private TabPessoa pessoa;

	public TabCadastro(Long id, TabEmpresa empresa, TabOperacao operacao, TabTransporte transporte, TabPessoa pessoa) {
		this.id = id;
		this.empresa = empresa;
		this.operacao = operacao;
		this.transporte = transporte;
		this.pessoa = pessoa;
	}

	public TabCadastro() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TabEmpresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(TabEmpresa empresa) {
		this.empresa = empresa;
	}

	public TabOperacao getOperacao() {
		return operacao;
	}

	public void setOperacao(TabOperacao operacao) {
		this.operacao = operacao;
	}

	public TabTransporte getTransporte() {
		return transporte;
	}

	public void setTransporte(TabTransporte transporte) {
		this.transporte = transporte;
	}

	public TabPessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(TabPessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "TabCadastro [id=" + id + ", empresa=" + empresa + ", operacao=" + operacao + ", transporte="
				+ transporte + ", pessoa=" + pessoa + "]";
	}

}
