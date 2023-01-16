package com.TPOO.TP1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {
    ZooDao zoo= new ZooDao();
    Chien c1;
    Chat ca2;

    @Test
    void nouveauVisiteur()  throws LimiteVisiteurException {
        for(int i=0;i<14;i++){
            zoo.nouveauVisiteur();
        }
        Exception e= assertThrows(LimiteVisiteurException.class, () -> {
                    zoo.nouveauVisiteur();
                }
        );

    }




    @Test
    void nouvelAnimal() {
    }


}