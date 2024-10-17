package assignment6;

public class MoneyBackCalculator {
    private int oneThousands = 0;
    private int fiveHundreds = 0;
    private int twoHundreds = 0;
    private int hundreds = 0;
    private int fifties = 0;
    private int twenties = 0;
    private int tens = 0;
    private int fives = 0;
    private int twos = 0;
    private int ones = 0;
    private final int[] exchangeArray = {1000, 500, 200, 100, 50, 20, 10, 5, 1};
    private int exchange;


    public int calcExchange(int price, int inputMoney){
        return price - inputMoney;
    }

    public String returNoteEnding(int noteSize){
        if(noteSize > 10){
            return "-lappar";
        } else {
            return "-kronor";
        }
    }

    public String isItEnoughMoney(int money, int cost){
        if (money == cost){
            return "Det blev ingen växel!";
        } else if (money < cost){
            return "Du lämnade för lite pengar";
        } else {
            return "run";
        }
    }

    public int exchangeReturn(int noteType){
        return exchange / noteType;
    }

    public int[] getExchangeArray() {
        return exchangeArray;
    }

    public void setExchange(int exchange) {
        this.exchange = exchange;
    }

    public int getExchange() {
        return exchange;
    }

    public void updateSaldo(int totalSaldoCalc) {
        this.exchange -= totalSaldoCalc;
    }

    public int getOneThousands() {
        return oneThousands;
    }

    public void setOneThousands(int oneThousands) {
        this.oneThousands = oneThousands;
    }

    public int getFiveHundreds() {
        return fiveHundreds;
    }

    public void setFiveHundreds(int fiveHundreds) {
        this.fiveHundreds = fiveHundreds;
    }

    public int getTwoHundreds() {
        return twoHundreds;
    }

    public void setTwoHundreds(int twoHundreds) {
        this.twoHundreds = twoHundreds;
    }

    public int getHundreds() {
        return hundreds;
    }

    public void setHundreds(int hundreds) {
        this.hundreds = hundreds;
    }

    public int getFifties() {
        return fifties;
    }

    public void setFifties(int fifties) {
        this.fifties = fifties;
    }

    public int getTwenties() {
        return twenties;
    }

    public void setTwenties(int twenties) {
        this.twenties = twenties;
    }

    public int getTens() {
        return tens;
    }

    public void setTens(int tens) {
        this.tens = tens;
    }

    public int getFives() {
        return fives;
    }

    public void setFives(int fives) {
        this.fives = fives;
    }

    public int getTwos() {
        return twos;
    }

    public void setTwos(int twos) {
        this.twos = twos;
    }

    public int getOnes() {
        return ones;
    }

    public void setOnes(int ones) {
        this.ones = ones;
    }
}
