import java.util.Scanner;

public class Matrix
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы 1 = ");
        int len1 = scanner.nextInt();
        System.out.print("Введите размер матрицы 2 = ");
        int len2 = scanner.nextInt();
        int tabl [][]=new int[len1] [len2];
        for (int j=0; j<len1; j++)
        {
            for (int i=0; i<len2; i++)
            {
                System.out.printf("Введите число для массива %d = ", i);
                tabl[j][i] = scanner.nextInt();
            }
        }
        for (int i=0; i<len2; i++)
        {
            System.out.println("Элемент [" + i + "] : " + tabl[0][i]*3);
        }
    }
}


