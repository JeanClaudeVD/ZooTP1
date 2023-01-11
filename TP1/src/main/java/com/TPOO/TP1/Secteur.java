package com.TPOO.TP1;

import java.util.List;

public class Secteur {
    private TypeAnimal typeAnimauxDansSecteur;
    List<Animal> animauxDansSecteur;

    public Secteur(TypeAnimal type){
        typeAnimauxDansSecteur=type;
    }

    public void ajouterAnimal(Animal animal){
        animauxDansSecteur.add(animal);
    }
    public int getNombreAnimaux(){
        return animauxDansSecteur.size();
    }
    public TypeAnimal obtenirType(){
        return typeAnimauxDansSecteur;
    }
}
