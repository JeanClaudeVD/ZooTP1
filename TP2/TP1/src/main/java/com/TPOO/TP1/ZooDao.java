package com.TPOO.TP1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ZooDao implements Dao {
    public int visiteurs;
    List<Secteur> secteursAnimaux;
    private int nbVisiteurMaxParSecteur =15;

    public ZooDao(){
        secteursAnimaux=new ArrayList<Secteur>();
        secteursAnimaux.add(new Secteur(TypeAnimal.chat));
        secteursAnimaux.add(new Secteur(TypeAnimal.chien));
    }

    public void ajouterSecteur(TypeAnimal type){
        secteursAnimaux.add(new Secteur(type));
    }
    public void nouveauVisiteur() throws LimiteVisiteurException {
        if(visiteurs>=nbVisiteurMaxParSecteur*secteursAnimaux.size())
            throw new LimiteVisiteurException();
        else
            visiteurs++;

    }
    public int getLimiteVisiteur(){
        return nbVisiteurMaxParSecteur*secteursAnimaux.size();
    }
    public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException{
        for(int i=0;i<secteursAnimaux.size();i++){
            if(animal.getTypeAnimal()==secteursAnimaux.get(i).obtenirType()){
                secteursAnimaux.get(i).ajouterAnimal(animal);
            }
        }

    }
    public int nombreAnimaux(){
        return secteursAnimaux.size();
    }
}
