package com.endereco.Entidades;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

/**
 * classe que representara um país
 * @author Nathan Luis
 * data da ultima modificacao: 15/07/2022
 *
 */
@Getter
@Setter
public class Pais {
	/**
	 * informa o nome do país
	 */
    String nome;
    /**
     * representa todos os estados que o país possui
     */
    ArrayList<Estado> estado;
    
}
