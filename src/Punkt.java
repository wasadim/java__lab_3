
public class Punkt {
    private int pX;
    private int pY;
    private int pZ;

    public Punkt() {
    }           
    public Punkt(int x) {
        this.pX = x;
    }     
     public Punkt(int x,int y,int z) {
        this.pX = x;
        this.pY = y;
        this.pZ = z;
    }    
    
    public void setX(int X) {
        this.pX = X;
    }    
    public int getX() {
        return this.pX;
    }

    public void setY(int Y) {
        this.pY = Y;
    }    
    public int getY() {
        return this.pY;
    }

    public void setZ(int Z) {
        this.pZ = Z;
    }    
    public int getZ() {
        return this.pZ * 10;
    }

    public int suma(){
        return this.pX + this.pY + this.pZ;
    }

    public int roznica(){
        return this.pX - this.pY - this.pZ;
    }

    public int roznica(int x, int y, int z){
        return this.pX*x - this.pY*y - this.pZ*z;
    }

    @Override
    public String toString() {
        return "Punkt{" + "x=" + this.pX + ", y=" + this.pY + ", z=" + this.pZ + '}';
    }


}    

/* stworzyć zmienne prywatne pX, pY, pZ */

/* stworzyć
    a) pusty konstruktor,
    b) konstruktor inicjalizujacy zmienną pX,
    c) konstruktor inicjalizujący wszystkie zmienne,
    d) stworzyć settery i gettery,
    e) getter do zmiennej pZ niech zwraca return pZ * 10;
    podpowiedz ALT + INSERT można wybrać generowanie automatyczne
    konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
*/

/* Stworzyć metody
    a) suma - sumująca wszystkie wartości w klasie
    b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
    c) metody różnica mają wykonwywać dzialania :
        roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
    d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
 */