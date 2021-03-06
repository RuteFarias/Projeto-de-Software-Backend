package edu.ccc.pharma.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "lancamento")
public class Lancamento implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "venda")
	private ArrayList<Produto> venda;
	
	@Column(name = "quantidade_itens")
	private Integer quantidadeItens;
	
	@Column(name = "total")
	private double total;
		
	public Lancamento() {
		
	}
	
	public Lancamento(Integer quantidadeItens, double total, ArrayList<Produto> venda) {
		this.venda = venda;
		this.quantidadeItens = quantidadeItens;
		this.total = total;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ArrayList<Produto> getVenda() {
		return venda;
	}

	public void setVenda(ArrayList<Produto> venda) {
		this.venda = venda;
	}

	public Integer getQuantidadeItens() {
		return quantidadeItens;
	}

	public double getTotal() {
		return total;
	}

}
