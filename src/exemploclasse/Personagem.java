/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploclasse;

/**
 *
 * @author Alunos
 */
public class Personagem {
    
    private String nome, cla, aldeia;
    private long nivelChakra;
    private char sexo;
    private byte idade, idadeMental;
    
    public void setNome(String x1) { 
        this.nome = x1;   
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setCla (String nomeCla) {
        
        this.cla = nomeCla;
    }
    
    public String getCla() {
        return cla;
    }
    
    public void setAldeia (String nomeAldeia) {
        this.aldeia = nomeAldeia;
    }
    
    public String getAldeia() {
        return aldeia;
    }
    
    public void setNivelChakra(long nivelChakra) {
        this.nivelChakra = nivelChakra;
    }
    
    public long getNivelChakra() {
        return nivelChakra;
    }
    
    public void setSexo (char nomeSexo) {
        this.sexo = nomeSexo;
    }
    
    public char getSexo() {
        return sexo;
    }
    
    public void setIdade (byte nomeIdade) {
        this.idade = nomeIdade;
    }
    
    public byte getIdade() {
        return idade;
    }
    
    public void setIdadeMental (byte nomeMental) {
        this.idadeMental = nomeMental;
    }
    
    public byte getIdadeMental () {
        return idadeMental;
    }
    
    
    
    
}
