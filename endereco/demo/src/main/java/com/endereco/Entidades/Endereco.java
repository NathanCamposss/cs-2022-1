package com.endereco.Entidades;

import java.util.ArrayList;


/**
 * Classe que representa conceitualmente um endereco
 * @author Nathan Luis
 * última data de modificação: 15/07/2022
 */
public class Endereco {
	/**
	 * informa o número do endereco
	 */
    Integer numero;
    /**
     * informa qualquer tipo de complemento de um endereco como o apartamento, 'proximo de'
     */
    String complemento;
    /**
     * informa o CEP do endereco
     */
    Integer cep;
    /**
     * informa o logradouro do endereco
     */
    Logradouro logradouro;
    /**
     * uma lista com todas as pessoas fisicas presentes/donas daquele endereco
     */
    ArrayList<PessoaFisica> pessoaFisica;
    /**
     * informa o tipo de endereco
     */
    TipoEndereco ti;
    /**
     * informa o nome do bairro onde se localiza o endereco
     */
    Bairro bairro;
    
}
