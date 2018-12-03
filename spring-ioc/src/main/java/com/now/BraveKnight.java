package com.now;

public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    public void embarkOnQuest(String msg){
        quest.embark(msg);
    }
}
