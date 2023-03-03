package org.example;

public class Revisor{

    private String revisorName;

    public Revisor(String revisorName) {
        this.revisorName = revisorName;
    }

    public void closeStore(Store store){
        if (store.getName() == "IKEA")
            store.setName(null);
    }

    public void rebranding(Store store){
        if (store.getName().equals("MacDonalds")) {
            store.setName("Вкусно и точка");
        }else{
            store.setName(store.getName().substring(1));
        }
    }
}
