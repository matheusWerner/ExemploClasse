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
public class Pessoa {
    
    // atributos significa caracteristicas
    public String nome, sobrenome, cpf;
    public byte idade;
    public float peso, altura;
    public char sexo;
    
    @Override
    public String toString() {
        return
                "Nome: " + nome +
                "Idade: " + idade +
                "Sobrenome: " + sobrenome +
                "Peso: " + peso +
                "Altura: " + altura +
                "Sexo: " + sexo +
                "CPF: " + cpf;
    }
    
    
    
    
    
    
    
    
    
}

