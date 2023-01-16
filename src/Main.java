public class Main {
    public static void main(String[] args)
    {
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));    //Expected result: 20
        System.out.println(EvenDigitSum.getEvenDigitSum(252));          //Expected result: 4
        System.out.println(EvenDigitSum.getEvenDigitSum(-22));          //Expected result: -1
    }

    public static class EvenDigitSum
    {
        public static int getEvenDigitSum(int iNumber)
        {
            if (iNumber < 0) return -1;
            else {
                int iEvenSum = 0;
                int iCheckDigit;
                int iCalNumber = iNumber;

                while (iCalNumber > 0)
                {
                    iCheckDigit = iCalNumber % 10;
                    iCalNumber = iCalNumber / 10;
                    if (iCheckDigit % 2 == 0) iEvenSum = iEvenSum + iCheckDigit;
                }
                return iEvenSum;
            }
        }
    }
}