package com.endereco.Entidades;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * Classe que representa conceitualmente o significado de pessoa física
 * @author Nathan Luis
 * última data de modificação: 15/07/2022
 */
@Getter
@Setter
public class PessoaFisica {
	/**
	 * mostra o nome da pessoa fisica
	 */
    String nome;
    /**
     * informa o sexo/genero da pessoa
     */
    String sexo;
    /**
     * informa a data de nascimento da pessoa
     */
    Date dataNascimento;
    /**
     * informa todos os enderecos que a pessoa possui
     */
    ArrayList<Endereco> enderecos;
}