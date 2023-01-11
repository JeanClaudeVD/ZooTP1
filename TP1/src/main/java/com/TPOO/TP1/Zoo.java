package com.TPOO.TP1;

import java.util.List;

public class Zoo {
    public int visiteurs;
    List<Secteur> secteursAnimaux;
    private int nbVisiteurMaxParSecteur;

    public Zoo(){

    }

    private void ajouterSecteur(TypeAnimal type){
        secteursAnimaux.add(new Secteur(type));
    }
    private void nouveauVisiteur(){
        visiteurs++;

    }
    private int getLimiteVisiteur(){
        return nbVisiteurMaxParSecteur;
    }
    private void nouvelAnimal(Animal animal){
        for(int i=0;i<secteursAnimaux.size();i++){
            if(animal.getTypeAnimal()==secteursAnimaux.get(i).obtenirType()){
                secteursAnimaux.get(i).ajouterAnimal(animal);
            }
        }

    }
    private int nombreAnimaux(){
        return secteursAnimaux.size();
    }
}
