package com.TPOO.TP1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ZooService implements Service{
    @Autowired
    Dao zooDao;

    public Dao getZooDao() {
        return zooDao;
    }

    public void setZooDao(Dao zooDao) {
        this.zooDao = zooDao;
    }

    @Override
    public void ajouterSecteur(TypeAnimal type) {
        zooDao.ajouterSecteur(type);
    }

    @Override
    public void nouveauVisiteur() throws LimiteVisiteurException {
        zooDao.nouveauVisiteur();
    }

    @Override
    public int getLimiteVisiteur() {
       return zooDao.getLimiteVisiteur();
    }

    @Override
    public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
        zooDao.nouvelAnimal(animal);
    }

    @Override
    public int nombreAnimaux() {
        return zooDao.nombreAnimaux();
    }
}
