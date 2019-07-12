public class Printer {

    private int toner;
    private int page;
    private boolean duplex;

    public Printer(int toner, int page, boolean duplex) {
        this.toner = toner;
        this.page = page;
        this.duplex = duplex;
    }

    public int getToner() {
        return toner;
    }


    public void setToner(int toner) {
        this.toner = toner;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }


    public void tonning(int requiredTone) {
        if (requiredTone < 0) {
            this.toner = 0;
        } else if (requiredTone > 100) {
            this.toner = 100;
        } else {
            this.toner = requiredTone;
        }
    }


    public void print(int page) {

        this.page=this.page+page;
        System.out.println("Upto page number "+this.page+" is printed");

    }
    public void duplexAlter(){
        System.out.println("Alter the pages as printer is duplex");
    }

}