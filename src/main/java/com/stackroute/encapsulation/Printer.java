package com.stackroute.encapsulation;

public class Printer {

    private float tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isSingleSided;

    public Printer(float tonerLevel,int numberOfPagesPrinted,boolean isSingleSided) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted=numberOfPagesPrinted;
        this.isSingleSided=isSingleSided;
    }
    

    public float getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPagesPrinted;
    }



    public void setTonerLevel(float tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPagesPrinted = numberOfPages;
    }




}


