package bankinterestcal;

public class Bank {
        final String name;
        static double interest;
        static double pri;
        static int year;
    public Bank(String name) {
        this.name = name;
    }
        void principal()
        {
            double balance=0;
            balance=pri+balance;
            System.out.println(balance);
        }
        void calculate()
        {
            interest=(pri*interest*year)/100;
        }
        void display()
        {
            System.out.println("BANK NAME :"+name);
            System.out.println("BANK PRINCPAL AMOUNT"+pri);
            System.out.println("YEARS :"+year);
            System.out.println("INTEREST AMOUNT :"+interest);
        }
}
