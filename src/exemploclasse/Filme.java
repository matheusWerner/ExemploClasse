package exemploclasse;

import java.time.LocalDate;

/**
 *
 * @author Alunos
 */
public class Filme {

    private String titulo, tituloOriginal, genero, diretor;
    private short anoLancamento;
    private double valorFaturamento, valorOrcamento;
    private long espectadores;
    private String classificacao;
    private double mediaPreco;
    private LocalDate dataLancamentoBrasil;
    private String idioma;
    
    public void setTitulo (String nomeTitulo) {
        this.titulo = nomeTitulo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTituloOriginal (String nomeOriginal) {
        this.tituloOriginal = nomeOriginal;   
    }
    
    public String getTituloOriginal() {
        return tituloOriginal;
    }
    
    public void setGenero (String nomeGenero) {
        this.genero = nomeGenero;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setDiretor (String nomeDiretor) {
        this.diretor = nomeDiretor;
    }
    
    public String getDiretor() {
        return diretor;
    }
    
    public void setAnoLancamento (short nomeAno) {
        this.anoLancamento = nomeAno;
    }
    
    public short getAnoLancamento() {
        return anoLancamento;
    }
    
    public void setValorFaturamento (double nomeFaturamento) {
        this.valorFaturamento = nomeFaturamento;
    }
    
    public double getValorFaturamento() {
        return valorFaturamento;
    }
    
    public void setValorOrcamento (double nomeOrcamento) {
        this.valorOrcamento = nomeOrcamento;
    }
    
    public double getValorOrcamento() {
        return valorOrcamento;
    }
    
    public void setEspectadores (long nomeEspectadores) {
        this.espectadores = nomeEspectadores;
    }
    
    public long getEspectadores() {
        return espectadores;
    }
    
    public void setClassificacao (String nomeClassi) {
        this.classificacao = nomeClassi;
    }
    
    public String getClassificacao() {
        return classificacao;
    }
    
    public void setMediaPreco (double nomeMedia) {
        this.mediaPreco = nomeMedia;
    }
    
    public double getMediaPreco() {
        return mediaPreco;
    }
    
    public void setDataLancamentoBrasil (LocalDate nomeLancamento) {
         this.dataLancamentoBrasil = nomeLancamento;
    }
    
    public LocalDate getDataLancamentoBrasil() {
        return dataLancamentoBrasil;
    }
    
    public void setIdioma (String nomeIdioma) {
        this.idioma = nomeIdioma;
    }
    
    public String getIdioma(){
        return idioma;
    }
    
    
        
    
    

}
