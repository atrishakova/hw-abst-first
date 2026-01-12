import ru.netology.accounts.CreditAccount;
import ru.netology.accounts.SimpleAccount;

public class Main {
    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount(1000);
        CreditAccount creditAccount = new CreditAccount(-500, 300);

        System.out.println("Баланс SimpleAccount: " + simpleAccount.getBalance());
        System.out.println("Баланс CreditAccount: " + creditAccount.getBalance());

        boolean transferResult = simpleAccount.transfer(creditAccount, 300);
        System.out.println("Перевод успешен: " + transferResult);
        System.out.println("Баланс SimpleAccount после перевода: " + simpleAccount.getBalance());
        System.out.println("Баланс CreditAccount после перевода: " + creditAccount.getBalance());

        transferResult = creditAccount.transfer(simpleAccount, 100);
        System.out.println("Перевод успешен: " + transferResult); // true
        System.out.println("Баланс SimpleAccount: " + simpleAccount.getBalance());
        System.out.println("Баланс CreditAccount: " + creditAccount.getBalance());


        boolean addResult = creditAccount.add(500);
        System.out.println("Пополнение CreditAccount на 500: " + addResult);
        System.out.println("Баланс CreditAccount: " + creditAccount.getBalance());
    }
}
