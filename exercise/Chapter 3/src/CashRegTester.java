/**
 This class tests the CashReg class.
 Version for CS 455 lab 3.  Modified from version from Big Java, 6th ed.
 Also tests getTotal() accessor function.
 */
public class CashRegTester
{
    public static void main(String[] args)
    {
        CashReg register = new CashReg();

        register.recordPurchase(4.35);
        System.out.print("Total: ");
        System.out.println(register.getTotal());   // Total = 4.35 dollars
        System.out.println("Expected: 4.35");
        System.out.println();

        register.receivePayment(5, 0, 0, 0, 0);   // Payment = 5 dollars = 5 dollars
        System.out.print("Change: ");   // Change = 5 - 4.35 = 0.65 dollars
        System.out.println(register.giveChange());   // Change = 0.65; Total = 0; Payment = 0;
        System.out.println("Expected: 0.65");
        System.out.println();

        register.recordPurchase(0.75);
        System.out.print("Total: ");
        System.out.println(register.getTotal());   // Total = 0.75 dollars
        System.out.println("Expected: 0.75");
        System.out.println();

        register.recordPurchase(1.50);
        System.out.print("Total: ");
        System.out.println(register.getTotal());   // Total = 0.75 + 1.5 = 2.25 dollars
        System.out.println("Expected: 2.25");
        System.out.println();

        register.receivePayment(2, 0, 5, 0, 0);   // Payment = 2 dollars + 5 dimes = 2.5 dollars
        System.out.print("Change: ");   // Change = 2.5 - 2.25 = 0.25 dollars
        System.out.println(register.giveChange());   // Change = 0.25; Total = 0; Payment = 0;
        System.out.println("Expected: 0.25");
        System.out.println();

        register.recordPurchase(2.25);
        System.out.print("Total: ");   // Total = 2.25
        System.out.println(register.getTotal());
        System.out.println("Expected: 2.25");
        System.out.println();

        register.recordPurchase(19.25);
        System.out.print("Total: ");   // Total = 2.25 +19.25 = 21.5
        System.out.println(register.getTotal());
        System.out.println("Expected: 21.5");
        System.out.println();

        register.receivePayment(23, 2, 0, 0, 0);   // Payment = 23 dollars + 2 quarters = 23.5 dollars
        System.out.print("Change: ");   // Change = Payment - Total = 23.5 - 21.5 = 2.0 dollars
        System.out.println(register.giveChange());   // Change = 2.0; Total = 0; Payment = 0;
        System.out.println("Expected: 2.0");
    }
}

