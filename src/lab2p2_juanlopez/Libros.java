/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_juanlopez;


public class Libros {
    private String titulo;
    private String autor;
    private String genero;
    private String año;
    private String disponibilidad;
    
    public Libros(String titulo, String autor, String genero, String año,String disponibilidad){
        this.autor=autor;
        this.año=año;
        this.genero=genero;
        this.titulo=titulo;
        this.disponibilidad=disponibilidad;
    }
    public Libros(){
        
    }
    public String gettitle(){
        return titulo;
    }
    public String getauthor(){
        return autor;
    }
    public String getgenre(){
        return genero;
    }
    public String getyear(){
        return año;
    }
    public String getaccess(){
        return disponibilidad;
    }
    public void settitle(String titulo){
        this.titulo=titulo;
    }
    public void setauthor(String autor){
        this.autor=autor;
    }
    public void setgenre(String genero){
        this.genero=genero;
    }
    public void setyear(String año){
        this.año=año;
    }
    public void setaccess(String disponibilidad){
        this.disponibilidad=disponibilidad;
    }
    public String ToString(){
        return 
    "Título del libro: "+titulo+"    Autor: "+autor+"    Año de publicación: "+año+"    Género: "+genero+"    Disponibilidad:"+disponibilidad;
    }
}
