public class Recurtion {
    public void Funcion() {
        Funcion();
    }
    public static void main (String args[]){
        Recurtion r = new Recurtion();
        r.Funcion();
    }
}