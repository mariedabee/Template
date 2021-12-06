package com.hz;

public class IsHighSchoolGraduationCard extends PrintTemplate{


    @Override
    void printLine(String msg) {
        System.out.println(msg);

    }

    @Override
    void printHeader() {
        String  header = "--@--#--&----------------------&--#--@--";
        printLine(header);
    }

    @Override
    void printMessage() {
        String msg = "This calls for celebrating! Congratulations!";
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
        String footer = "--@--#--&----------------------&--#--@--";
        printLine(footer);
    }
}
