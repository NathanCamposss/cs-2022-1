package com.endereco.Entidades;

import java.util.ArrayList;


import lombok.Getter;
import lombok.Setter;

/**
 * Classe que representa conceitualmente o significado de logradouro
 * @author Nathan Luis
 * última data de modificação: 15/07/2022
 */
@Getter
@Setter
public class Logradouro {
	/**
	 * informa o nome do logradouro
	 */
    private String nome;
    /**
     * informa uma lista de enderecos presentes no logradouro
     */
    ArrayList<Endereco> endereco;
    /**
     * informa o tipo de logradouro 
     */
    ArrayList<TipoLogradouro> tipoLogradouro;
    
    
}
