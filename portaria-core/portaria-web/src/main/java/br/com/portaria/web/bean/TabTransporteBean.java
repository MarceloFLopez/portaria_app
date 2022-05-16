package br.com.portaria.web.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.portaria.domain.TabTransporte;
import br.com.portaria.wbusiness.TabTransporteBO;
import br.com.portaria.web.util.FacesUtil;

import javax.faces.event.ActionEvent;

@Named
@ViewScoped
public class TabTransporteBean implements Serializable{

	private static final long serialVersionUID = 1L;

	/* Variáveis */
	private TabTransporte tabTransporte;
	private List<TabTransporte> tabTransporteList;
	private List<TabTransporte> tabTransporteListFilter;

	//GETs and SETs
	
	public TabTransporte getTransporte() {
		return tabTransporte;
	}
	public void setTransporte(TabTransporte pessoa) {
		this.tabTransporte = pessoa;
	}
	public List<TabTransporte> getTabTransporteList() {
		return tabTransporteList;
	}
	public void setTabTransporteList(List<TabTransporte> tabTransporteList) {
		this.tabTransporteList = tabTransporteList;
	}
	public List<TabTransporte> getTabTransporteListFilter() {
		return tabTransporteListFilter;
	}
	public void setTabTransporteListFilter(List<TabTransporte> tabTransporteListFilter) {
		this.tabTransporteListFilter = tabTransporteListFilter;
	}
	
	// Inject
	@Inject
	private TabTransporteBO tabTransporteBO;
	
	// CRUD
	
	public void listAll() {
		try {
			// list
			tabTransporteList = tabTransporteBO.listAll();
		} catch (Exception e) {
			tabTransporteList = new ArrayList<TabTransporte>();
		}
	}
	
	public void save(ActionEvent event) {
		// test
		if (tabTransporte.getModelo().length() == 0) {
			FacesUtil.addMsgErro();
			return;
		}
		// save
		try {
			tabTransporteBO.salvar(tabTransporte);
			FacesUtil.addMsgSucessfull();
		} catch (Exception e) {
			e.printStackTrace();
			tabTransporte = new TabTransporte();
			FacesUtil.addMsgErro();
		}
	}
	
	public void selectItem(TabTransporte t) {
		this.tabTransporte = t;
	}
	
	public void newItem(TabTransporte t) {
		this.tabTransporte = new TabTransporte();
	}

	public void delete(TabTransporte t) {
		try {
			tabTransporteBO.remover(t);
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
