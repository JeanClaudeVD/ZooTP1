package com.TPOO.TP1;

import static com.TPOO.TP1.TypeAnimal.chat;

public class Chat extends Animal{

    public Chat(String nom, TypeAnimal type) {
        super(nom, chat);
    }

    @Override
    String getNomAnimal(){
        return super.getNomAnimal();

    }
}
