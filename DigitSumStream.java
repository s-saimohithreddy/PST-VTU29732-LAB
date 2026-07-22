public class DigitSumStream {

    public static int digitSum(int num, String opt) {
        boolean isEvenMode = opt.equalsIgnoreCase("even");

        return String.valueOf(Math.abs(num))
                .chars()                                  
                .map(Character::getNumericValue)          
                .filter(digit -> (digit % 2 == 0) == isEvenMode) 
                .sum();                                
    }

    public static void main(String[] args) {
        int number = 982374;

        System.out.println("Sum of EVEN digits: " + digitSum(number, "even"));

       
        System.out.println("Sum of ODD digits: " + digitSum(number, "odd"));
    }
}