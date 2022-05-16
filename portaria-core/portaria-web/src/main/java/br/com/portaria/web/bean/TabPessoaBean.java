package br.com.portaria.web.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.portaria.domain.TabPessoa;
import br.com.portaria.wbusiness.TabPessoaBO;
import br.com.portaria.web.util.FacesUtil;

import javax.faces.event.ActionEvent;

@Named
@ViewScoped
public class TabPessoaBean implements Serializable{

	private static final long serialVersionUID = 1L;

	/* Variáveis */
	private TabPessoa tabPessoa;
	private List<TabPessoa> tabPessoaList;
	private List<TabPessoa> tabPessoaListFilter;

	//GETs and SETs
	
	public TabPessoa getPessoa() {
		return tabPessoa;
	}
	public void setPessoa(TabPessoa pessoa) {
		this.tabPessoa = pessoa;
	}
	public List<TabPessoa> getTabPessoaList() {
		return tabPessoaList;
	}
	public void setTabPessoaList(List<TabPessoa> tabPessoaList) {
		this.tabPessoaList = tabPessoaList;
	}
	public List<TabPessoa> getTabPessoaListFilter() {
		return tabPessoaListFilter;
	}
	public void setTabPessoaListFilter(List<TabPessoa> tabPessoaListFilter) {
		this.tabPessoaListFilter = tabPessoaListFilter;
	}
	
	// Inject
	@Inject
	private TabPessoaBO tabPessoaBO;
	
	// CRUD
	
	public void listAll() {
		try {
			// list
			tabPessoaList = tabPessoaBO.listAll();
		} catch (Exception e) {
			tabPessoaList = new ArrayList<TabPessoa>();
		}
	}
	
	public void save(ActionEvent event) {
		// test
		if (tabPessoa.getName().length() == 0) {
			FacesUtil.addMsgErro();
			return;
		}
		// save
		try {
			tabPessoaBO.salvar(tabPessoa);
			FacesUtil.addMsgSucessfull();
		} catch (Exception e) {
			e.printStackTrace();
			tabPessoa = new TabPessoa();
			FacesUtil.addMsgErro();
		}
	}
	
	public void selectItem(TabPessoa t) {
		this.tabPessoa = t;
	}
	
	public void newItem(TabPessoa t) {
		this.tabPessoa = new TabPessoa();
	}

	public void delete(TabPessoa t) {
		try {
			tabPessoaBO.remover(t);
			FacesUtil.addMsgSucessfull();
		} catch (Exception e) {
			e.printStackTrace();
			FacesUtil.addMsgErro();
		}
	}
	
	public String refreshPage() {
		return "/pages/model.xhtml?faces-redirect=true";
	}
	
}
