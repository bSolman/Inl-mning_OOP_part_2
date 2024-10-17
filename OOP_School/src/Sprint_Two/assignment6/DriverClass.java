package assignment6;

import java.util.Objects;

public class DriverClass {
    public DriverClass(){
        System.out.println("Hello world!");
        int moneyReceived = 1000;
        int itemValue = 453;
        MoneyBackCalculator mb = new MoneyBackCalculator();
        int[] notes = mb.getExchangeArray();
        mb.setExchange(moneyReceived - itemValue);
        if (Objects.equals(mb.isItEnoughMoney(50, 50), "run")){
            for (int note : notes) {
                if (mb.exchangeReturn(note) != 0) {
                    System.out.println("Antal " + note + mb.returNoteEnding(note) + ": " + mb.exchangeReturn(note) + ".");
                    mb.updateSaldo(note * mb.exchangeReturn(note));
                }
            }
        } else {
            System.out.println(mb.isItEnoughMoney(50, 50));
        }
    }
}
