import java.util.Scanner;

public class lab8_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] vertices = new int[3][n*3];
        int[][] answers = new int[3][n];
        for (int i = 0; i < n*3; i+=3) {
            vertices[0][i] = scanner.nextInt();
            vertices[1][i] = scanner.nextInt();
            vertices[2][i] = 1;
            vertices[0][i+1] = scanner.nextInt();
            vertices[1][i+1] = scanner.nextInt();
            vertices[2][i+1] = 1;
            vertices[0][i+2] = scanner.nextInt();
            vertices[1][i+2] = scanner.nextInt();
            vertices[2][i+2] = 1;
        }
        int count = 0;
        for (int i = 0; i < n*3; i+=3) {
            int x1 = vertices[0][i];
            int y1 = vertices[1][i];
            int x2 = vertices[0][i+1];
            int y2 = vertices[1][i+1];
            int x3 = vertices[0][i+2];
            int y3 = vertices[1][i+2];
            double a = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
            double b = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
            double c = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));
            if (a+b>c && b+c>a && c+a>b) {
                answers[0][count] = 1;
                if (a==b && b==c) {
                    answers[1][count] = 1;
                } else if (a==b || b==c || c==a) {
                    answers[1][count] = 3;
                } else if (Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2) || Math.pow(b, 2)+Math.pow(c, 2)==Math.pow(a, 2) || Math.pow(c, 2)+Math.pow(a, 2)==Math.pow(b, 2)) {
                    answers[1][count] = 2;
                } else {
                    answers[1][count] = 4;
                }
                double p = (a+b+c)/2;
                double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                answers[2][count] = (int)area;
            }
            count++;
        }
        printAnswers(answers);
        checkSameArea(answers);
    }
    
    public static void printAnswers(int[][] answers) {
        System.out.println("Results:");
        for (int i = 0; i < answers[0].length; i++) {
            System.out.println("Triangle " + (i+1) + ":");
            System.out.println("Existence: " + answers[0][i]);
            System.out.println("Classification: " + answers[1][i]);
            System.out.println("Area: " + answers[2][i]);
        }
    }
    
    public static void checkSameArea(int[][] answers) {
        System.out.print("Triangles with same area: ");
        for (int i = 0; i < answers[0].length-1; i++) {
            for (int j = i+1; j < answers[0].length; j++) {
                if (answers[0][i]==1 && answers[0][j]==1 && answers[2][i]==answers[2][j]) {
                    System.out.print((i+1) + ", " + (j+1) + " ");
                }
            }
        }
    }
}
