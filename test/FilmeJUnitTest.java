
import exemploclasse.Filme;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class FilmeJUnitTest {
    
    @Test
    
    public void testeDefinirEObterDiretor() {
        Filme tarantino = new Filme();
        tarantino.setDiretor("Tarantino");
        assertEquals("Tarantino", tarantino.getDiretor());
    }
    
    @Test
    
    public void testeDefinirEObterTitulo() {
        Filme pulpFiction = new Filme();
        pulpFiction.setTitulo("Pulp Fiction");
        assertEquals("Pulp Fiction", pulpFiction.getTitulo());
    }
    
     @Test
    
    public void testeDefinirEObterTituloOriginal() {
        Filme temposViolencia = new Filme();
        temposViolencia.setTituloOriginal("Tempos de Violência");
        assertEquals("Tempos de Violência", temposViolencia.getTituloOriginal());
    }
    
    @Test
    
    public void testeDefinirEObterGenero() {
        Filme acao = new Filme();
        acao.setGenero("Ação");
        assertEquals("Ação", acao.getGenero());
    }
    
    @Test
    
    public void testeDefinirEObterAnoLancamento() {
        Filme lancamento = new Filme();
        lancamento.setAnoLancamento((short) 1999);
        assertEquals(1999, lancamento.getAnoLancamento());
    }
    
    @Test
    
    public void testeDefinirEObterValorFaturamento() {
        Filme faturamento = new Filme();
        faturamento.setValorFaturamento((double) 212900000);
        assertEquals(212900000, faturamento.getValorFaturamento(),0);
    }
    
    @Test
    
    public void testeDefinirEObterValorOrcamento() {
        Filme orcamento = new Filme();
        orcamento.setValorOrcamento((double) 100900000);
        assertEquals(100900000, orcamento.getValorOrcamento(),0);
    }
    
    @Test
    
    public void testeDefinirEObterEspectadores() {
        Filme espectadores = new Filme();
        espectadores.setEspectadores((long) 5000000);
        assertEquals(5000000, espectadores.getEspectadores());
    }
    
     @Test
    
    public void testeDefinirEObterClassificacao() {
        Filme classificacao = new Filme();
        classificacao.setClassificacao("+18");
        assertEquals("+18", classificacao.getClassificacao());
    }
    
     @Test
    
    public void testeDefinirEObterMediaPreco() {
        Filme mediaPreco = new Filme();
        mediaPreco.setMediaPreco((double) 15);
        assertEquals(15, mediaPreco.getMediaPreco(),0);
    }
    
    /* @Test
    
    public void testeDefinirEObterDataLancamentoBrasil() {
        Filme lancamentoBrasil = new Filme();
        lancamentoBrasil.setDataLancamentoBrasil(10062000);
        assertEquals(10062000, lancamentoBrasil.getDataLancamentoBrasil());
    }
    
    */
    
    @Test
    
    public void testeDefinirEObterIdioma() {
        Filme idioma = new Filme();
        idioma.setIdioma("Inglês");
        assertEquals("Inglês", idioma.getIdioma());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
