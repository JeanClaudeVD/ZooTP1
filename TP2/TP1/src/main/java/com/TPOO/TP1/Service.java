package com.TPOO.TP1;

import java.util.List;

public interface Service {
    int visiteurs =0;
    List<Secteur> secteurAnimaux=null;
    public int nbVisiteurMaxParSecteur =15;

    public void ajouterSecteur(TypeAnimal type);
    public void nouveauVisiteur() throws LimiteVisiteurException;
    public int getLimiteVisiteur();
    public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException;
    public int nombreAnimaux();
}
