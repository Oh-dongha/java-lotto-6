package validator;

public class MoneyValidator {
    public static void moneyValidate(String money) {
        moneyNotNull(money);
        moneyIsNumber(money);
        int moneyNumber = Integer.parseInt(money);
    }

    private static void moneyNotNull(String money) {
        if (money.isEmpty()) {
            throw new IllegalArgumentException("[ERROR] 값을 입력해주세요.");
        }
    }

    private static void moneyIsNumber(String money) {
        if (!money.matches("[0-9]+")) {
            throw new IllegalArgumentException("[ERROR] 양의 정수를 입력해주세요.");
        }
    }

    private static void moneyNotZero(int moneyNumber) {
        if (moneyNumber == 0) {
            throw new IllegalArgumentException("[ERROR] 양의 정수를 입력해주세요.");
        }
    }
}
