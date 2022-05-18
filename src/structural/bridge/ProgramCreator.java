package structural.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockMarket(new CppDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
