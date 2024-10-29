package ExceptionHandling;

public class Main {
    public static void main(String[] args) throws ArithmeticException {
         int a = 10;
         int b = 0;

         try{
//            if(b == 0) {
//                throw  new Exception("Denominator cannot be zero");
//            }

            float result = (float) (a / b);

             System.out.println(result);

         } catch (ArithmeticException e) {
             System.out.println(e.getMessage());
         }

    }
}
