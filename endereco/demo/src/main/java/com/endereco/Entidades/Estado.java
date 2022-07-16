package com.endereco.Entidades;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

/**
 * Classe que representa conceitualmente o estado
 * @author Nathan Luis
 * última data de modificação: 15/07/2022
 */
@Getter
@Setter
public class Estado {
	/**
	 * informa a sigla do estado
	 */
    private String sigla;
    /**
     * informa o nome do estado
     */
    String nome;
    /**
     * informa as cidades que estão presentes dentro do estado
     */
    ArrayList<Cidade> cidades;
    /**
     * informa em que pais esta localizado determinado estado
     */
    Pais pais;
    
}