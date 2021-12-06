package com.hz;

public abstract class PrintTemplate {
   abstract void printLine(String msg) ;
    abstract void printHeader();
    abstract void printMessage();
    abstract void printImage();
    abstract void printFooter();

    //template method
    public final void print(){
        printHeader();
        printMessage();
        printImage();
        printFooter();

    }
    /* void printLine(String msg);*/
}
