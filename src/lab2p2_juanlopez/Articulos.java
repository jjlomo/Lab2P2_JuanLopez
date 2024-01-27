/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_juanlopez;

public class Articulos {
    private String titulo;
    private String autor;
    private String tema;
    private String fecha;
    private String disponibilidad;
    
    public Articulos(String titulo,String autor, String tema, String fecha,String disponibilidad){
    this.autor=autor;
        this.fecha=fecha;
        this.tema=tema;
        this.titulo=titulo;
        this.disponibilidad=disponibilidad;
}
    public Articulos(){
        
    }
    public String gettitle(){
        return titulo;
    }
    public String getauthor(){
        return autor;
    }
    public String gettheme(){
        return tema;
    }
    public String getdate(){
        return fecha;
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
    public void settheme(String tema){
        this.tema=tema;
    }
    public void setDate(String fecha){
        this.fecha=fecha;
    }
    public void setaccess(String disponibilidad){
        this.disponibilidad=disponibilidad;
    }
    public String ToString(){
        return 
    "Título del artículo: "+titulo+"    Autor: "+autor+"    Fecha de publicación: "+fecha+"    Disponibilidad:"+disponibilidad;
    }
}
