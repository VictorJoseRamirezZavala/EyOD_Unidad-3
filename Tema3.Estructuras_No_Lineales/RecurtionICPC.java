/*
*   TecNM-ITESS-TICS Agosto-Diciembre 2026
*   Estructura y Organización de Datos 
*   Docente: Francisco Javier Montecillo Puente
*   Intento de programador: VJRZ
*   Email: TI25110104@salvatierra.tecnm.mx
*   Descripción: Clase para trabajar arboles usando ICPC

*   20/11/2026
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;

interface IGrafo{
    void addVertex(int V);
    void addEdge(int V, int U);
    void getVertex(int V);
    List<Integer> getEdge(int V);
    int vortexSize();
    int edgeSize();
}


public class RecurtionICPC {
    // FastReader class for efficient input
    int numero;
    FastReader reader = new FastReader();

    static class FastReader {
        // BufferedReader to read input
        BufferedReader b;
        // StringTokenizer to tokenize input
        StringTokenizer s; 

        // Constructor to initialize BufferedReader
        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        // Method to read the next token as a string
        String next() {
            while (s == null || !s.hasMoreElements()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    e.printStackTrace(); 
                }
            }
            return s.nextToken();
        }

        // Method to read the next token as an integer
        int nextInt() { 
                return Integer.parseInt(next()); 
        }

        // Method to read Char
        char nextChar() {
            return next().charAt(0);
        }

        // Method to read the next token as a long
        long nextLong() { 
            return Long.parseLong(next()); 
        }

        // Method to read the next token as a double
        double nextDouble() { 
            return Double.parseDouble(next()); 
        }

        // Method to read the next line as a string
        String nextLine() {
            String str = "";
            try {
                if (s.hasMoreTokens()) {
                    str = s.nextToken("\n");
                } else {
                    str = b.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace(); 
            }
            return str;
        }
    }

    public void leerDatos() {
        numero = reader.nextInt();
    }

    public void resuelve() {
        // TODO
        int resultado = numero * 2 + 1;
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        RecurtionICPC id  = new RecurtionICPC();

        id.leerDatos();
        id.resuelve();
    }   
}