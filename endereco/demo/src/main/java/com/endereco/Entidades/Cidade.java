package com.endereco.Entidades;
import java.util.ArrayList;



import lombok.Getter;
import lombok.Setter;

/**
 * Classe que representa conceitualmente a cidade
 * @author Nathan Luis
 * última data de modificação: 15/07/2022
 */
@Getter
@Setter
public class Cidade {
	/**
	 * atributo que carrega o nome da cidade
	 */
    String nome;
    /**
     * atributo que possui uma lista com todos os bairros que a cidade possue
     */
    ArrayList<Bairro> bairros;
    /**
     * atributo que representa em qual estado a cidade se localiza
     */
    Estado estado;
}