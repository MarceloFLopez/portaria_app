package br.com.portaria.web.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.portaria.domain.TabOperacao;
import br.com.portaria.wbusiness.TabOperacaoBO;
import br.com.portaria.web.util.FacesUtil;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;

@Named
@ViewScoped
public class TabOperacaoBean implements Serializable{

	private static final long serialVersionUID = 1L;

	/* Variáveis */
	private TabOperacao tabOperacao;
	private List<TabOperacao> tabOperacaoList;
	private List<TabOperacao> tabOperacaoListFilter;

	@PostConstruct
	public void newItem(TabOperacao t) {
		this.tabOperacao = new TabOperacao();
	}
	
	//GETs and SETs
	
	public TabOperacao getTabOperacao() {
		if (tabOperacao == null) {
			tabOperacao = new TabOperacao();
		}
		return tabOperacao;
	}
	
	public TabOperacao getOperacao() {
		return tabOperacao;
	}
	public void setOperacao(TabOperacao pessoa) {
		this.tabOperacao = pessoa;
	}
	public List<TabOperacao> getTabOperacaoList() {
		return tabOperacaoList;
	}
	public void setTabOperacaoList(List<TabOperacao> tabOperacaoList) {
		this.tabOperacaoList = tabOperacaoList;
	}
	public List<TabOperacao> getTabOperacaoListFilter() {
		return tabOperacaoListFilter;
	}
	public void setTabOperacaoListFilter(List<TabOperacao> tabOperacaoListFilter) {
		this.tabOperacaoListFilter = tabOperacaoListFilter;
	}
	
	// Inject
	@Inject
	private TabOperacaoBO tabOperacaoBO;
	
	// CRUD
	

	
	public void listAll() {
		try {
			// list
			tabOperacaoList = tabOperacaoBO.listAll();
		} catch (Exception e) {
			tabOperacaoList = new ArrayList<TabOperacao>();
		}
	}
	
	public void save(ActionEvent event) {
		// test
		if (tabOperacao.getName().length() == 0) {
			FacesUtil.addMsgErro();
			return;
		}
		// save
		try {
			tabOperacaoBO.salvar(tabOperacao);
			FacesUtil.addMsgSucessfull();
		} catch (Exception e) {
			e.printStackTrace();
			tabOperacao = new TabOperacao();
			FacesUtil.addMsgErro();
		}
	}
	
	public void selectItem(TabOperacao t) {
		this.tabOperacao = t;
	}


	public void delete(TabOperacao t) {
		try {
			tabOperacaoBO.remover(t);
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
