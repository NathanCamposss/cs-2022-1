package com.endereco.Entidades;
import java.util.ArrayList;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cidade {
    String nome;
    ArrayList<Bairro> bairros;
    Estado estado;
}