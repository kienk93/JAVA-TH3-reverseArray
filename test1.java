import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khai báo mảng, size của mảng
        int size;
        int[] array;
        // vòng lặp khi size > 20
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.print("Size does not exceed 20");
            }
        } while (size > 20);
        // nhập giá trị các phần tử trong mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }
        //In ra mảng đã nhập
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //Đảo ngược thứ tự các phần tử trong mảng
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        //In ra mảng sau khi đã đảo ngược thứ tự các phần tử
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}