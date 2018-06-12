
package exemploclasse;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Principal {

   
    public static void main(String[] args) {
        
        Pessoa lucas = new Pessoa();

        lucas.nome = "Lucas";
        lucas.idade = 16;
        lucas.peso = 94.0f;
        lucas.altura = 1.94f;
        lucas.sexo = 'm';
        lucas.cpf = "123.456.782-12";
        lucas.sobrenome = "Rodrigo";
        
        Pessoa carlos = new Pessoa();
        carlos.nome = "Carlos";
        carlos.idade = 18;
        carlos.peso = 78;
        carlos.altura = 1.78f;
        carlos.sexo = 'm';
        carlos.cpf = "333.333.333-55";
        carlos.sobrenome = "Augusto";
        
        JOptionPane.showMessageDialog(null, lucas);
        
        JOptionPane.showMessageDialog(null, carlos);
         
         
         
         
         
         Macaco macaco1 = new Macaco();
         Macaco macaco2 = new Macaco();
         Macaco macaco3 = new Macaco();
         Macaco macaco4 = new Macaco();
         Macaco macaco5 = new Macaco();
         
         macaco1.nome = "Babuíno";
         macaco1.nomeCientifico = "Papio";
         macaco1.corPelo = "Cinza";
         macaco1.apelido = "Jack";
         macaco1.reino = "Animalia";
         macaco1.filo = "Chordata";
         macaco1.classe = "Mammalia";
         macaco1.ordem = "Primates";
         macaco1.familia = "Cercopithecidae";
         macaco1.genero = "Papio";
         macaco1.especie = "Papio Anubis";
         macaco1.altura = 0.70f;
         macaco1.peso = 20;
         
         JOptionPane.showMessageDialog(null, macaco1);
                 
         macaco2.nome = "Bugio";
         macaco2.nomeCientifico = "Alouatta";
         macaco2.corPelo = "Laranja";
         macaco2.apelido = "Odair";
         macaco2.reino = "Animalia";
         macaco2.filo = "Chordata"; 
         macaco2.classe = "Mammalia";
         macaco2.ordem = "Primates";
         macaco2.familia = "Atelidae";
         macaco2.genero = "Alouatta";
         macaco2.especie = "Bugio";
         macaco2.altura = 1.30f;
         macaco2.peso = 6;
         
         JOptionPane.showMessageDialog(null, macaco2);
                 
         macaco3.nome = "Chimpanzé";
         macaco3.nomeCientifico = "Pan";
         macaco3.corPelo = "Preto";
         macaco3.apelido = "Yuri";
         macaco3.reino = "Animalia";
         macaco3.filo = "Chordata";
         macaco3.classe = "Mammalia";
         macaco3.ordem = "Primates";
         macaco3.familia = "Hominidae";
         macaco3.genero = "Pan";
         macaco3.especie = "Pan troglodytes";
         macaco3.altura = 1.20f;
         macaco3.peso = 50;
         
         JOptionPane.showMessageDialog(null, macaco3);
                 
         macaco4.nome = JOptionPane.showInputDialog("Digite o nome do Macaco");
         macaco4.nomeCientifico = JOptionPane.showInputDialog("Digite o nome científico do Macaco");
         macaco4.corPelo = JOptionPane.showInputDialog("Digite a cor do pelo do Macaco");
         macaco4.apelido = JOptionPane.showInputDialog("Digite o apeldio do Macaco");
         macaco4.reino = JOptionPane.showInputDialog("Digite o reino do Macaco");
         macaco4.filo = JOptionPane.showInputDialog("Digite o filo do Macaco");
         macaco4.classe = JOptionPane.showInputDialog("Digite a classe do Macaco");
         macaco4.ordem = JOptionPane.showInputDialog("Digite a ordem do Macaco");
         macaco4.familia = JOptionPane.showInputDialog("Digite a família do Macaco");
         macaco4.genero = JOptionPane.showInputDialog("Digite o gênero do Macaco");
         macaco4.especie = JOptionPane.showInputDialog("Digite a espécie do Macaco");
         macaco4.altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do Macaco"));
         macaco4.peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do Macaco"));
             
         JOptionPane.showMessageDialog(null, macaco4);
         
         macaco5.nome = JOptionPane.showInputDialog("Digite o nome do Macaco");
         macaco5.nomeCientifico = JOptionPane.showInputDialog("Digite o nome científico do Macaco");
         macaco5.corPelo = JOptionPane.showInputDialog("Digite a cor do pelo do Macaco");
         macaco5.apelido = JOptionPane.showInputDialog("Digite o apeldio do Macaco");
         macaco5.reino = JOptionPane.showInputDialog("Digite o reino do Macaco");
         macaco5.filo = JOptionPane.showInputDialog("Digite o filo do Macaco");
         macaco5.classe = JOptionPane.showInputDialog("Digite a classe do Macaco");
         macaco5.ordem = JOptionPane.showInputDialog("Digite a ordem do Macaco");
         macaco5.familia = JOptionPane.showInputDialog("Digite a família do Macaco");
         macaco5.genero = JOptionPane.showInputDialog("Digite o gênero do Macaco");
         macaco5.especie = JOptionPane.showInputDialog("Digite a espécie do Macaco");
         macaco5.altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do Macaco"));
         macaco5.peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do Macaco"));
             
         JOptionPane.showMessageDialog(null, macaco5);
    }
    
}
