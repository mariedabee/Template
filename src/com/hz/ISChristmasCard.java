package com.hz;

public class ISChristmasCard extends PrintTemplate{
    private boolean isChristmasCard;


    @Override
    void printLine(String msg) {
        System.out.println(msg);
    }

    @Override
    void printHeader() {
        String header = "XXXXXXXXXXXXXXX";
        printLine(header);
    }

    @Override
    void printMessage() {
        String msg = "Merry Christmas!";
       printLine(msg);
    }

    @Override
    void printImage() {
        printLine("     ,_");
        printLine("| `\"\"---..._____");
        printLine("'-...______    _````\"\"\"\"\"\"\"'`|");
        printLine("       \\   ```` ``\"---...__  |");
        printLine("       |`              |   ``!");
        printLine("       |               |     A");
        printLine("       |               /\\   /#\\");
        printLine("       /`--..______..-'  |  ###");
        printLine("      |   /  `\\    /`--. |  ###");
        printLine("  XXXXXXXXXX--CHRISTMAS--XXXXXXXX");
        printLine("     _|  |  .-;`-./;-.  ||  ###");
        printLine("    / \\  \\ /\\_|    |_/\\ //\\ ##'");
        printLine("    |  `-' \\__/ _  \\__/ |  |`#");
        printLine("   \\_,                 /_/");
        printLine("       `\\              /");
        printLine("         '.  '.__.'  .'");
        printLine(" jgs      `-,____,-'");
        printLine("           /\"\"\"I\"\"\\");
        printLine("           /`---'--'\\");

    }

    @Override
    void printFooter() {
       String footer = "!!!!!!!!!!!!!!!!!!!!!!-";
        printLine(footer);
    }
}



