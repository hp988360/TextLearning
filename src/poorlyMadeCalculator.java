public class poorlyMadeCalculator {
    public static void main(String[] args) {

        int numberOne = 12; //edit these numbers all the way down
        int numberTwo = 15;
        int hi = Math.addExact(numberOne, numberTwo);
        System.out.println(hi);

        int numberThree = 47;
        int numberFour = 56;
        int hi2 = Math.multiplyExact(numberThree,numberFour);
        System.out.println(hi2);

        int numberFive = 303;
        int numberSix = 45;
        int hi3 = Math.divideExact(numberFive,numberSix);
        System.out.println(hi3);

        int numberSeven = 3209;
        int numberEight = 1382;
        int hi4 = Math.subtractExact(numberSeven, numberEight);
        System.out.println(hi4);




    }
}
