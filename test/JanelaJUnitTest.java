
import org.junit.Test;
import static org.junit.Assert.*;
import exemploclasse.Janela;

/**
 *
 * @author Alunos
 */
public class JanelaJUnitTest {
    
    @Test
    
    public void testeDefinirEObterMarca() {
        Janela sasazaki = new Janela();
        sasazaki.setMarca("Sasazaki");
        assertEquals("Sasazaki", sasazaki.getMarca());
    }
    
    @Test
    
    public void testeDefinirEObterInsufilm() {
        Janela insufilm = new Janela();
        insufilm.setInsufilm("Não");
        assertEquals("Não", insufilm.getInsufilm());
    }
    
    @Test
    
    public void testeDefinirEObterComprimento() {
        Janela comprimento = new Janela();
        comprimento.setComprimento(1.00f);
        assertEquals(1.00, comprimento.getComprimento(),0);
    }
    
    @Test
    
    public void testeDefinirEObterLargura() {
        Janela largura = new Janela();
        largura.setLargura(0.50f);
        assertEquals(0.50, largura.getLargura(),0);
    }
    
    @Test
    
    public void testeDefinirEObterAltura() {
        Janela altura = new Janela();
        altura.setAltura(1.20f);
        assertEquals(1.20f, altura.getAltura(),0);
    }
    
    @Test
    
    public void testeDefinirEObterPreco() {
        Janela preco = new Janela();
        preco.setPreco(150.20f);
        assertEquals(150.20f, preco.getPreco(),0);
    }
    
}
