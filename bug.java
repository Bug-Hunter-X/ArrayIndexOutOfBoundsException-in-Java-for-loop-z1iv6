public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i <= array.length; i++) {
            array[i] = i * 2; //Bug: This line causes an ArrayIndexOutOfBoundsException
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}