import java.util.Scanner;

class rough {

    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);

        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] arr3 = new int[3][3];

        char op;

        System.out.println("Enter elements of arr1:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of arr2:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter operation to perform: ");
        op = sc.next().charAt(0);

        switch (op) {
            case '+':
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        arr3[i][j] = arr1[i][j] + arr2[i][j];
                    }
                }
                System.out.println("arr3:");
                printArr(arr3);
                break;
            case '-':
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        arr3[i][j] = arr1[i][j] - arr2[i][j];
                    }
                }
                System.out.println("arr3:");
                printArr(arr3);
                break;
            case '*':
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        arr3[i][j] = 0;
                        for (int k = 0; k < 3; k++) {
                            arr3[i][j] += arr1[i][k] * arr2[k][j];
                        }
                    }
                }
                System.out.println("arr3:");
                printArr(arr3);
                break;
            default:
                System.out.println("Invalid operation!");
        }
    }
}