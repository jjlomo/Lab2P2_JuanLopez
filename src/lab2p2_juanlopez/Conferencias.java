/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_juanlopez;


public class Conferencias {
    private String titulo;
    private String conferencista;
    private String fecha;
    private int duracion; 
    private String enlace;
    
    public Conferencias(String titulo,String conferencista, String fecha, int duracion, String enlace){
        this.conferencista=conferencista;
        this.fecha=fecha;
        this.titulo=titulo;
        this.duracion=duracion;
        this.enlace=enlace;
}
    public Conferencias(){
        
    }
    public String gettitle(){
        return titulo;
    }
    public String getinstructor(){
        return conferencista;
    }
    public int gettime(){
        return duracion;
    }
    public String getdate(){
        return fecha;
    }
    public String getlink(){
        return enlace;
    }
    public void settitle(String titulo){
        this.titulo=titulo;
    }
    public void setinstructor(String conferencista){
        this.conferencista=conferencista;
    }
    public void settime(int duracion){
        this.duracion=duracion;
    }
    public void setdate(String fecha){
        this.fecha=fecha;
    }
    public void setlink(String enlace){
        this.enlace=enlace;
    }
    public String ToString(){
        return 
    "Título de la conferencia: "+titulo+"    Conferencista: "+conferencista+"   Fecha de la actividad: "+fecha+"    Duración en horas: "+duracion+"    Enlace de acceso: "+enlace;
    }
    
}
