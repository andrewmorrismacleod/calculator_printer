public class Printer {

    private int numberOfSheets;
    private int tonerVolume;
    private int tonerQuality;

    public Printer(){
        this.numberOfSheets = 100;
        this.tonerVolume = 50;
        this.tonerQuality = 1;
    }

    public int getNumberOfSheets(){
        return this.numberOfSheets;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public int getTonerQuality(){
        return this.tonerQuality;
    }

    public void reduceSheets(int numberOfPages){
        this.numberOfSheets = this.numberOfSheets - numberOfPages;
    }

    public boolean checkPaperCapacity(int required){
        return getNumberOfSheets() >= required;
    }

    public boolean checkTonerCapacity(int required){
        return getTonerVolume()>=required;
    }

    public void print(int numberOfPages, int numberOfCopies){
        int totalPaperRequired = numberOfPages * numberOfCopies;
        int totalTonerRequired = totalPaperRequired * getTonerQuality();


        if (checkPaperCapacity(totalPaperRequired) && checkTonerCapacity(totalTonerRequired)){
            reduceSheets(totalPaperRequired);
            reduceToner(totalPaperRequired);
        }

    }

    public void refill(){
        this.numberOfSheets = 100;
    }

    public void reduceToner(int totalPaperRequired){

        this.tonerVolume = this.tonerVolume - getTonerQuality() * totalPaperRequired;
    }

}
