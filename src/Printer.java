public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int addToner (int tonerAmount) {
        if ((tonerLevel + tonerAmount) > 100 || (tonerLevel + tonerAmount) < 0)  {
            return -1;
        } else {
            tonerLevel += tonerAmount;
            return tonerLevel;
        }
    }

    public int printPages (int pages) {
        if (duplex) {
            pagesPrinted += Math.round(pages / 2);
            System.out.println("This is a duplex printer.");
        } else {
            pagesPrinted += pages;
        }
    return pagesPrinted;
    }

    @Override
    public String toString () {
        return "Tonerlevel=" + tonerLevel + "// Pages printed=" + pagesPrinted;
    }
}
