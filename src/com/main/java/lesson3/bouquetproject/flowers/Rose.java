package com.main.java.lesson3.bouquetproject.flowers;

public class Rose extends Flower {
    private boolean hasSpikes;
    private boolean hasWideStem;

    public Rose(String color, int length, boolean hasWideStem){
        this.color = color;
        this.length = length;
        this.setHasSpikes();
        this.setHasWideStem(random.nextBoolean());
        this.setAmountOfDaysInShop();
    }

    public boolean isHasSpikes() {
        return hasSpikes;
    }

    public void setHasSpikes() {
        this.hasSpikes = Math.round(Math.random())==0 ? true:false;
    }

    public boolean isHasWideStem() {
        return hasWideStem;
    }

    public void setHasWideStem(boolean hasWideStem) {
        this.hasWideStem = hasWideStem;
    }
}
