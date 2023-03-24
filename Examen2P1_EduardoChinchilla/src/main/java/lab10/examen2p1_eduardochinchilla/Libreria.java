package lab10.examen2p1_eduardochinchilla;

import java.util.ArrayList;

public class Libreria {

    private ArrayList<String> titulos;
    private ArrayList<String> autores;
    
     public Libreria() {
        titulos = new ArrayList<>();
        autores = new ArrayList<>();
    }
     public void addLibro(String titulo,String autor){
         titulos.add(titulo);
         autores.add( autor);
     }
     public void elimLibro(String titulo){
         titulos.remove(0);
         autores.remove(0);
     }
     public void findLibro(String titulo){
         for (int j=0; j<titulos.size();j++){
             int indice = titulos.indexOf(j);
             if(indice ==-1){
                 System.out.println("Lo sentimos, el libro no esta en el inventario");
             }else{
                System.out.println("Titulo: "+titulos.get(indice));
                System.out.println("Autor: "+autores.get(indice));
             }
         }
     }
     public void listLibro(){
         int libro =1;
         for (int i =0; i<titulos.size();i++){
             System.out.println("Libro"+libro);
             libro++;
             System.out.println("titulo: "+titulos.get(i));
             System.out.println("autor: "+autores);
         }
        
     }
    public ArrayList<String> getTitulos() {
        return titulos;
    }

    public void setTitulos(ArrayList<String> titulos) {
        this.titulos = titulos;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    @Override
    public String toString() {
        return "Libreria{" + "titulos=" + titulos + ", autores=" + autores + '}';
    }
     
}
