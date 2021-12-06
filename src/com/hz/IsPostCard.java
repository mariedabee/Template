package com.hz;

public class IsPostCard extends PrintTemplate{


    @Override
    void printLine(String msg) {
        System.out.println(msg);

    }

    @Override
    void printHeader() {
        String header = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
      printLine(header);
    }

    @Override
    void printMessage() {
        String msg = "Greetings from the netherlands!";
       printLine(msg);
    }

    @Override
    void printImage() {
        printLine("        Art by Hayley Jane Wakenshaw");
        printLine("");
        printLine("             /)  (\\");
        printLine("        .-._((,~~.))_.-,");
        printLine("         `=.   99   ,='");
        printLine("           / ,o~~o. \\");
        printLine("          { { .__. } }");
        printLine("           ) `~~~\' (");
        printLine("          /`-._  _\\.-\\");
        printLine("         /         )  \\");
        printLine("       ,-X        #   X-.");
        printLine("hjw   /   \\          /   \\");
        printLine("     (     )| |  | |(     )");
        printLine("      \\   / | |  | | \\   /");
        printLine("       \\_(.-( )--( )-.)_/");
        printLine("       /_,\\ ) /  \\ ( /._\\");
        printLine("           /_,\\  /._\\");
    }

    @Override
    void printFooter() {
        String footer = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
        printLine(footer);
    }
}
