class Number {
    private int num;

    Number(int num) {
        this.num = num;
    }

    boolean isZero() {
        return this.num == 0;
    }

    boolean isPositive() {
        return this.num > 0;
    }

    boolean isNegative() {
        return this.num < 0;
    }

    boolean isOdd() {
        return (this.num % 2) == 1;
    }

    boolean isEven() {
        return (this.num % 2) == 0;

    }

    boolean isPrime() {
        for (int i = 1; i <= this.num / 2; i++) {
            if (this.num % i == 0) {
                return false;
            }
        }
        return true;
    }

    boolean isAmstrong() {
        return (true);
    }
}

public class JavaEx1 {
    public static void main(String[] args) {
        Number n1 = new Number(5);
        System.out.println(n1.isZero());
    }

}
