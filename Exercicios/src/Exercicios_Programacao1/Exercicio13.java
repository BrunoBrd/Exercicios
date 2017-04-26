/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_Programacao1;

/**
 *
 * @author Bruno
 */
public class Exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
        String nomeDoTime;
	String presidenteDoTime;
	String tecnicoDoTime;
	String titulosDoTime;
	
	public ObjetoTimeDeFutebol() {
		
	}
	
	public ObjetoTimeDeFutebol(String name, String nomePres, String tecnico, String titulo) {
		this.nomeDoTime = name;
		this.presidenteDoTime = nomePres;
		this.tecnicoDoTime = tecnico;
		this.titulosDoTime = titulo;
	}
	
	public String getPresidenteDoTime() {
		return presidenteDoTime;
	}
	public void setPresidenteDoTime(String presidenteDoTime) {
		this.presidenteDoTime = presidenteDoTime;
	}
	public String getTecnicoDoTime() {
		return tecnicoDoTime;
	}
	public void setTecnicoDoTime(String tecnicoDoTime) {
		this.tecnicoDoTime = tecnicoDoTime;
	}
	public String getTitulosDoTime() {
		return titulosDoTime;
	}
	public void setTitulosDoTime(String titulosDoTime) {
		this.titulosDoTime = titulosDoTime;
	}
	public String getNomeDoTime() {
		return nomeDoTime;
	}
	public void setNomeDoTime(String nomeDoTime) {
		this.nomeDoTime = nomeDoTime;
	}
	
	@Override
	public String toString() {
		return "O " + this.nomeDoTime + " tem como atual presidente o " + this.presidenteDoTime + " e atual técnico do São Paulo FC é o " + this.tecnicoDoTime + " e tem " + this.titulosDoTime +".";
    }
    
}
