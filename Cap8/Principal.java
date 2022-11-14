
public class Principal {

    public static void main(String[] args) {

        Arbol arbol = new Arbol();
        
        arbol.insertar (4,"Coco");
        arbol.insertar (9,"Manzana");
        arbol.insertar(3,"Peras");
        arbol.insertar(5,"Uvas");
        arbol.insertar(2,"Naranjas");
        
        arbol.recorrer(arbol.raiz);
        
        
    }
    
    
    
}
