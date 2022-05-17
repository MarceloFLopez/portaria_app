package br.com.portaria.web.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.portaria.domain.TabEmpresa;
import br.com.portaria.wbusiness.TabEmpresaBO;
import br.com.portaria.web.util.FacesUtil;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;

@Named
@ViewScoped
public class TabEmpresaBean implements Serializable{

	private static final long serialVersionUID = 1L;

	/* Variáveis */
	private TabEmpresa tabEmpresa;
	private List<TabEmpresa> tabEmpresaList;
	private List<TabEmpresa> tabEmpresaListFilter;

	@PostConstruct
	public void salvar() {
		TabEmpresa empresa = new TabEmpresa();
	}
	
	//GETs and SETs
	public TabEmpresa getTabEmpresa() {
		if (tabEmpresa == null) {
			tabEmpresa = new TabEmpresa();
		}
		return tabEmpresa;
	}
	
	public TabEmpresa getEmpresa() {
		return tabEmpresa;
	}
	public void setEmpresa(TabEmpresa pessoa) {
		this.tabEmpresa = pessoa;
	}
	public List<TabEmpresa> getTabEmpresaList() {
		return tabEmpresaList;
	}
	public void setTabEmpresaList(List<TabEmpresa> tabEmpresaList) {
		this.tabEmpresaList = tabEmpresaList;
	}
	public List<TabEmpresa> getTabEmpresaListFilter() {
		return tabEmpresaListFilter;
	}
	public void setTabEmpresaListFilter(List<TabEmpresa> tabEmpresaListFilter) {
		this.tabEmpresaListFilter = tabEmpresaListFilter;
	}
	
	// Inject
	@Inject
	private TabEmpresaBO tabEmpresaBO;
	
	// CRUD
	
	public void listAll() {
		try {
			// list
			tabEmpresaList = tabEmpresaBO.listAll();
		} catch (Exception e) {
			tabEmpresaList = new ArrayList<TabEmpresa>();
		}
	}
	
	public void save(ActionEvent event) {
		// test
		if (tabEmpresa.getName().length() == 0) {
			FacesUtil.addMsgErro();
			return;
		}
		// save
		try {
			tabEmpresaBO.salvar(tabEmpresa);
			FacesUtil.addMsgSucessfull();
		} catch (Exception e) {
			e.printStackTrace();
			tabEmpresa = new TabEmpresa();
			FacesUtil.addMsgErro();
		}
	}
	
	public void selectItem(TabEmpresa t) {
		this.tabEmpresa = t;
	}
	

	public void newItem(TabEmpresa t) {
		 tabEmpresa = new TabEmpresa();
	}

	public void delete(TabEmpresa t) {
		try {
			tabEmpresaBO.remove(t);
			FacesUtil.addMsgSucessfull();
		} catch (Exception e) {
			e.printStackTrace();
			FacesUtil.addMsgErro();
		}
	}
	
	public String refreshPage() {
		return "/pages/empresa.xhtml?faces-redirect=true";
	}
	
}
