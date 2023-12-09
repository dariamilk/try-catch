package pro.sky;

public class Main {
    public static void main(String[] args) {
       String[] array = new String[10];

       try {
           System.out.println("Element 12 = " + array[12]);
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("No such element");
       } catch (ArrayStoreException | NegativeArraySizeException e) {
           throw new RuntimeException();
       } finally {
       }
    }
}