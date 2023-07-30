package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        double a = 2.5;
        double b = 1.7;

        double part1 = 9 * a * a - 5 * b + 2 + a - 7;
        double part2 = (a + b - 4 * a * b) / 2;

        double result = part1 * part2;

        System.out.println("The result of the formula is: " + result);

        boolean formulaCorrect = Math.abs(result - ((9 * a * a - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2))) < 1e-10;
        System.out.println("Is the formula implemented correctly? " + formulaCorrect);
    }
}

