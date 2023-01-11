package com.TPOO.TP1;

public class Animal {
    public String nomAnimal;
    public TypeAnimal typeAnimal;

    public Animal(String nom, TypeAnimal type){
        nomAnimal=nom;
        typeAnimal=type;
    }

    String getNomAnimal(){
        return nomAnimal;
    }
    TypeAnimal getTypeAnimal(){
        return typeAnimal;
    }
}
