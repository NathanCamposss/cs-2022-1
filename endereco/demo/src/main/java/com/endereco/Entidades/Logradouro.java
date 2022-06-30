package com.endereco.Entidades;

import java.util.ArrayList;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Logradouro {
    private String nome;
    ArrayList<Endereco> endereço;
    ArrayList<TipoLogradouro> tipoLogradouro;
    
    
}
