
import exemploclasse.Brinquedo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class BrinquedoJUnitTest {
    
  @Test
  
  public void testeDefinirEObterNome() {
      Brinquedo legoClassic = new Brinquedo();
      legoClassic.setNome("Lego Classic");
      assertEquals("Lego Classic", legoClassic.getNome());   
  }
  
  @Test
  
  public void testeDefinirEObterMarca() {
      Brinquedo lego = new Brinquedo();
      lego.setMarca("Lego");
      assertEquals("Lego", lego.getMarca());
  }
  
  @Test
  
  public void testeDefinirEObterModelo() {
      Brinquedo modelo = new Brinquedo();
      modelo.setModelo("MD118");
      assertEquals("MD118", modelo.getModelo());
  }
  
  @Test
  
  public void testeDefinirEObterDescricao() {
      Brinquedo descricao = new Brinquedo();
      descricao.setDescricao("Brinquedo legal");
      assertEquals("Brinquedo legal", descricao.getDescricao());
  }
  
  @Test
  
  public void testeDefinirEObterPreco() {
      Brinquedo preco = new Brinquedo();
      preco.setPreco((double) 11599);
      assertEquals(11599, preco.getPreco(),0); 
  }
  
  @Test
  
  public void testeDefinirEObterCodigo() {
      Brinquedo codigo = new Brinquedo();
      codigo.setCodigo((double) 898900);
      assertEquals(898900, codigo.getCodigo(),0); 
  }
  
  @Test
  
  public void testeDefinirEObterCodigoBarra() {
      Brinquedo codigoBarra = new Brinquedo();
      codigoBarra.setCodigoBarra((double) 1212003);
      assertEquals(1212003, codigoBarra.getCodigoBarra(),0); 
  }
}
