package com.endereco.Entidades;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Estado {
    private String sigla;
    String nome;
    ArrayList<Cidade> cidades;
    Pais pais;
    
}