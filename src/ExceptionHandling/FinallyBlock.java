//package ExceptionHandling;
//public class FinallyBlock {
//    public static void main(String[] args) {
//        try {
//            System.out.println("try");
//        }
//        catch (Exception e){
//            System.out.println("catch");
//        }
//        finally {
//            System.out.println("finally");
//        }
//    }
//}
//
//class B{
//    public static void main(String[] args) {
//        try {
//            System.out.println("try");
//            System.out.println(10/0);
//        }
//        catch (ArithmeticException e){
//            System.out.println("catch");
//        }
//        finally {
//            System.out.println("finally");
//        }
//    }
//}
//
//class C{
//    public static void main(String[] args) {
//        try{
//            System.out.println("try");
//            System.out.println(10/0);
//        }
//        catch (NullPointerException e){
//            System.out.println("catch");
//        }
//        finally {
//            System.out.println("finally");
//        }
//    }
//}