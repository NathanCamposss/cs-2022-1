package com.endereco.Entidades;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

/**
 * Classe que representa conceitualmente o bairro
 * @author Nathan Luis
 * última data de modificação: 15/07/2022
 */
@Getter
@Setter
public class Bairro {
	/**
	 * Atributo que carregará o nome do bairro
	 */
    String nome;
    /**
     * atributo que carregará uma lista de enderecos presentes no bairro
     */
    ArrayList<Endereco> enderecos;
    /**
     * atributo que diz em qual cidade o bairro se localiza
     */
    Cidade cidade;

    
}
