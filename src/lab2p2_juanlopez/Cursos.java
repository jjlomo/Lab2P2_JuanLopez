/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_juanlopez;


public class Cursos {
    private String titulo;
    private String instructor;
    private int duracion;
    private String plataforma;
public Cursos(String titulo,String instructor, int duracion, String plataforma){
        this.instructor=instructor;
        this.duracion=duracion;
        this.titulo=titulo;
        this.plataforma=plataforma;
}
public Cursos(){
        
    }
    public String gettitle(){
        return titulo;
    }
    public String getinstructor(){
        return instructor;
    }
    public int gettime(){
        return duracion;
    }
    public String getplatform(){
        return plataforma;
    }
    public void settitle(String titulo){
        this.titulo=titulo;
    }
    public void setinstructor(String instructor){
        this.instructor=instructor;
    }
    public void settime(int duracion){
        this.duracion=duracion;
    }
    public void setplat(String plataforma){
        this.plataforma=plataforma;
    }
    public String ToString(){
        return 
    "Título del curso en línea: "+titulo+"    Instructor: "+instructor+"    Duración en semanas: "+duracion+"    Plataforma de enseñanza:"+plataforma;
    }
}
