package com.stackroute.encapsulation;

/**
 * Create a class and demonstrate proper encapsulation techniques.
 * The class will be called Printer and it will simulate a real Computer Printer.
 * It should have fields for the toner Level, number of pages printed,
 * and also whether it’s a duplex printer (capable of printing on both sides of the paper).
 * Add methods to fill up the toner (up to a maximum of 100%),
 * another method to simulate printing a page (which should increase the number of pages printed).
 * Decide on the scope, whether to use constructors, and anything else you think is needed
 */

public class Printer {

    private int tonerLevel;
    private int numberOfPagesToPrint;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPagesToPrint, boolean isDuplex) {
        if (tonerLevel >= 1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numberOfPagesToPrint = numberOfPagesToPrint;
        this.numberOfPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int print(int pages) {
        int pagesToPrint = pages;
        if (this.isDuplex) {
            pagesToPrint /= 2;
        }
        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

//    public int getTonerLevel() {
//        return tonerLevel;
//    }
//
//    public void setTonerLevel(int tonerLevel) {
//        this.tonerLevel = tonerLevel;
//    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }


    public int getNumberOfPagesToPrint() {
        return numberOfPagesToPrint;
    }

//    public void setNumberOfPagesToPrint(int numberofpages) {
//        this.numberOfPagesToPrint = numberofpages;
//    }
//
//    public boolean getisDuplex() {
//        return isDuplex;
//    }
//
//    public void setisDuplex(boolean isDuplex) {
//        this.isDuplex = isDuplex;
//    }

}

class TakePrint {
    public static void main(String[] args) {

        Printer printer = new Printer(100, 20, true);

        System.out.println("Number of pages to be printed:" + printer.getNumberOfPagesToPrint());
        int pagesPrinted = printer.print(20);
        System.out.println("Printed Pages:" + pagesPrinted);
        System.out.println("Pages to be printed:" + printer.getNumberOfPagesPrinted());

    }
}


