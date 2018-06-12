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
public class Macaco {
    
    public String nome, nomeCientifico, corPelo, apelido, reino, filo, classe, ordem, familia, genero, especie;
    public float altura, peso;
    
    @Override
    public String toString() {
        return "Nome: " + nome +
               "Nome Científico: " + nomeCientifico +
               "Cor do Pelo: " + corPelo +
               "Apelido: " + apelido +
               "Apelido: " + reino +
               "Reino: " + filo +
               "Filo: " + classe +
               "Classe: " + ordem +
               "Ordem: " + familia +
               "Família: " + genero +
               "Gênero: " + especie +
               "Espécie: " + altura +
               "Altura: " + peso;
                
                }
    
}
