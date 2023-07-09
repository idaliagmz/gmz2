import java.util.Scanner;

public class vector10 {
    public static void main(String[] args) {
        int dimension = 5;
        double[] vector = new double[dimension];
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese los valores del vector:");
        for (int i = 0; i < dimension; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            vector[i] = scanner.nextDouble();
        }
        
        System.out.println("Vector ingresado:");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Posición " + i + ": " + vector[i]);
        }
        
        // Inserción
        System.out.print("Ingrese el valor a insertar: ");
        double valorInsertar = scanner.nextDouble();
        System.out.print("Ingrese la posición donde desea insertar el valor: ");
        int posicion = scanner.nextInt();
        
        if (posicion >= 0 && posicion < dimension) {
            for (int i = dimension - 1; i > posicion; i--) {
                vector[i] = vector[i - 1];
            }
            vector[posicion] = valorInsertar;
            dimension++;
        } else {
            System.out.println("La posición ingresada es inválida.");
        }
        
        System.out.println("Vector después de la inserción:");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Posición " + i + ": " + vector[i]);
        }
        
        // Burbuja
        for (int i = 0; i < dimension - 1; i++) {
            for (int j = 0; j < dimension - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    double temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Vector después del ordenamiento:");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Posición " + i + ": " + vector[i]);
        }
        
        scanner.close();
    }
}
