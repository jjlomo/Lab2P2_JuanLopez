/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_juanlopez;

import java.util.ArrayList;
import java.util.Scanner;


public class Lab2P2_JuanLopez {

   
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        ArrayList <Usuarios> usuarios=new ArrayList();
        ArrayList <Libros> libros=new ArrayList();
        ArrayList <Articulos> articulos=new ArrayList();
        ArrayList <Cursos> cursos=new ArrayList();
        ArrayList <Conferencias> conferencias=new ArrayList();
        Libros lb=new Libros();
        Articulos ar=new Articulos();
        Cursos cur=new Cursos();
        Conferencias con=new Conferencias();
        usuarios.add(new Usuarios("Juanito", "diciembre", "Estudiante"));
        usuarios.add(new Usuarios("Osman", "progra2", "Profesor"));
        usuarios.add(new Usuarios("Crai@", "recursos", "Biblioteca"));
        System.out.println("*********************UNIVERSIDAD VIRTUAL*********************");
        System.out.println("");
        System.out.println("INICIO DE SESIÓN:");
        System.out.println("Ingrese su cuenta");
        String cuenta=leer.nextLine();
        System.out.println("Ingrese contraseña");
        String pass=leer.nextLine();
        String tipo="";
        char resp='s';
        while(resp!='n'){
            int controlu=0;
            int controlp=0;
            int t;
            for (int i = 0; i < usuarios.size(); i++) {
                if(usuarios.get(i).getuser().equals(cuenta)){
                    controlu++;
                
                if(usuarios.get(i).getpass().equals(pass)){
                    controlp++;
                    t=i;
                    tipo=usuarios.get(t).gettype();
                }
                }
            }
            
            if (controlu==0&&controlp==0){
                System.out.println("Usuario no encontrado");
            }else if (controlu>0&&controlp==0){
                System.out.println("Contraseña incorrecta");
            }else{
                switch (tipo){
                    case "Estudiante":
                    {
                        System.out.println("Su cuenta es de tipo: "+tipo);
                        System.out.println("");
                        System.out.println("*********OPCIONES*********\n" +
"1.	Listar recursos\n"+
"5.	Salir");
                        int opcion=leer.nextInt();
                        while (opcion!=5){
                        switch (opcion){
                            case 1:
                                System.out.println("Recursos totales");
                                System.out.println("");
                                System.out.println("Libros");
                                System.out.println("");
                                for (Libros l : libros) {
                                    System.out.println(libros.indexOf(l)+1+".  "+l.ToString());
                                }
                                System.out.println("");
                                System.out.println("Artículos");
                                System.out.println("");
                                for (Articulos a : articulos) {
                                    System.out.println(articulos.indexOf(a)+1+".  "+a.ToString());
                                }
                                System.out.println("");
                                System.out.println("Cursos en Línea");
                                System.out.println("");
                                for (Cursos c : cursos) {
                                    System.out.println(cursos.indexOf(c)+1+".  "+c.ToString());
                                }
                                System.out.println("");
                                System.out.println("Conferencias Virtuales");
                                System.out.println("");
                                for (Conferencias co : conferencias) {
                                    System.out.println(conferencias.indexOf(co)+1+".  "+co.ToString());
                                }
                                System.out.println("");
                        }
                        System.out.println("*********OPCIONES*********\n" +
"1.	Listar recursos\n"+
"5.	Salir");
                         opcion=leer.nextInt();
                        }

                        break;
                        
                    }
                    case "Profesor":
                    {
                        System.out.println("Su cuenta es de tipo: "+tipo);
                        System.out.println("");
                        System.out.println("*********OPCIONES*********\n" +
"1.	Listar recursos\n" +
"2.	Crear recurso\n" +
"5.	Salir");
                        int opcion=leer.nextInt();
                        while (opcion!=5){
                        switch (opcion){
                            case 1:
                                System.out.println("Recursos totales");
                                System.out.println("");
                                System.out.println("Libros");
                                System.out.println("");
                                for (Libros l : libros) {
                                    System.out.println(libros.indexOf(l)+1+".  "+l.ToString());
                                }
                                System.out.println("");
                                System.out.println("Artículos");
                                System.out.println("");
                                for (Articulos a : articulos) {
                                    System.out.println(articulos.indexOf(a)+1+".  "+a.ToString());
                                }
                                System.out.println("");
                                System.out.println("Cursos en Línea");
                                System.out.println("");
                                for (Cursos c : cursos) {
                                    System.out.println(cursos.indexOf(c)+1+".  "+c.ToString());
                                }
                                System.out.println("");
                                System.out.println("Conferencias Virtuales");
                                System.out.println("");
                                for (Conferencias co : conferencias) {
                                    System.out.println(conferencias.indexOf(co)+1+".  "+co.ToString());
                                }
                                System.out.println("");
                                
                                break;
                                
                                case 2:
                                    System.out.println("Ingrese tipo del recurso a agregar");
                                    System.out.println("1. Libros\n2. Artículos\n3. Cursos\n4.Conferencia\n5. Salir");
                                    int type=leer.nextInt();
                                        while (type!=5){
                                            switch (type){
                                                
                                        case 1:
                                            String titulo="";
                                            String autor="";
                                            String genero="";
                                            String año="";
                                            String disponible="";
                                            int disponibilidad=0;
                                            leer.nextLine();
                                            System.out.println("Ingrese título:");
                                            titulo=leer.nextLine();
                                            System.out.println("Ingrese autor:");
                                            autor=leer.nextLine();
                                            System.out.println("Ingrese género:");
                                            genero=leer.nextLine();
                                            System.out.println("Ingrese año de publicación:");
                                            año=leer.nextLine();
                                            System.out.println("¿Se encuentra disponible?");
                                            System.out.println("1. Sí\n2. No");
                                            while(disponibilidad!=1&&disponibilidad!=2){
                                            disponibilidad=leer.nextInt();
                                                if (disponibilidad==1){
                                                disponible="Sí";
                                                libros.add(new Libros(titulo, autor, genero, año, disponible));
                                            }else if(disponibilidad==2){
                                                disponible="No";
                                                libros.add(new Libros(titulo, autor, genero, año, disponible));
                                            }
                                                }
                                            break;
                                            
                                        case 2:
                                            leer.nextLine();
                                             titulo="";
                                             autor="";
                                            String tema="";
                                            String fecha="";
                                             disponible="";
                                             disponibilidad=0;
                                            System.out.println("Ingrese título:");
                                            titulo=leer.nextLine();
                                            System.out.println("Ingrese autor:");
                                            autor=leer.nextLine();
                                            System.out.println("Ingrese tema:");
                                            tema=leer.nextLine();
                                            System.out.println("Ingrese fecha de publicación:");
                                            fecha=leer.nextLine();
                                            System.out.println("¿Se encuentra disponible?");
                                            System.out.println("1. Sí\n2. No");
                                            while(disponibilidad!=1&&disponibilidad!=2){
                                                disponibilidad=leer.nextInt();
                                            if (disponibilidad==1){
                                                disponible="Sí";
                                                articulos.add(new Articulos(titulo, autor, tema, fecha, disponible));
                                            }else if(disponibilidad==2){
                                                disponible="No";
                                                articulos.add(new Articulos(titulo, autor, tema, fecha, disponible));
                                            }
                                                }
                                            break;
                                            
                                        case 3:
                                            leer.nextLine();
                                            titulo="";
                                             String instructor="";
                                            int duracion;
                                            String plataforma="";
                                            System.out.println("Ingrese título:");
                                            titulo=leer.nextLine();
                                            System.out.println("Ingrese autor:");
                                            autor=leer.nextLine();
                                            System.out.println("Ingrese duración en semanas:");
                                            duracion=leer.nextInt();
                                            System.out.println("Ingrese plataforma de enseñanza:");
                                            leer.nextLine();
                                            plataforma=leer.nextLine();
                                            cursos.add(new Cursos (titulo, instructor, duracion, plataforma));
                                            break;
                                            
                                        case 4:
                                            leer.nextLine();
                                            titulo="";
                                             String conferencista="";
                                             duracion=0;
                                            String enlace="";
                                            fecha="";
                                            System.out.println("Ingrese título:");
                                            titulo=leer.nextLine();
                                            System.out.println("Ingrese conferencista:");
                                            conferencista=leer.nextLine();
                                            System.out.println("Ingrese fecha de actividad:");
                                            fecha=leer.nextLine();
                                            System.out.println("Ingrese duración en horas:");
                                            duracion=leer.nextInt();
                                            System.out.println("Ingrese enlace de acceso:");
                                            leer.nextLine();
                                            enlace=leer.nextLine();
                                            conferencias.add(new Conferencias(titulo, conferencista, fecha, duracion, enlace));
                                            
                                            break;
                                            
                                            
                                    }
                                            System.out.println("Ingrese tipo del recurso a agregar");
                                    System.out.println("1. Libros\n2. Artículos\n3. Cursos\n4.Conferencia\n5. Salir");
                                     type=leer.nextInt();
                                    }
                        }
                        System.out.println("");
                        System.out.println("*********OPCIONES*********\n" +
"1.	Listar recursos\n" +
"2.	Crear recurso\n" +
"5.	Salir");
                        opcion=leer.nextInt();
                        }
                        
                        break;
                    }
                        
                    case "Biblioteca":
                        System.out.println("Su cuenta es de tipo: "+tipo);
                        System.out.println("");
                        System.out.println("*********OPCIONES*********\n" +
"1.	Listar recursos\n" +
"2.	Crear recurso\n" +
"3.	Eliminar recurso\n" +
"4.	Modificar recurso\n" +
"5.	Salir");
                        int opcion=leer.nextInt();
                        while (opcion!=5){
                        switch (opcion){
                            case 1:
                                System.out.println("Recursos totales");
                                System.out.println("");
                                System.out.println("Libros");
                                System.out.println("");
                                for (Libros l : libros) {
                                    System.out.println(libros.indexOf(l)+1+".  "+l.ToString());
                                }
                                System.out.println("");
                                System.out.println("Artículos");
                                System.out.println("");
                                for (Articulos a : articulos) {
                                    System.out.println(articulos.indexOf(a)+1+".  "+a.ToString());
                                }
                                System.out.println("");
                                System.out.println("Cursos en Línea");
                                System.out.println("");
                                for (Cursos c : cursos) {
                                    System.out.println(cursos.indexOf(c)+1+".  "+c.ToString());
                                }
                                System.out.println("");
                                System.out.println("Conferencias Virtuales");
                                System.out.println("");
                                for (Conferencias co : conferencias) {
                                    System.out.println(conferencias.indexOf(co)+1+".  "+co.ToString());
                                }
                                System.out.println("");
                                
                                break;
                                
                                case 2:
                                    System.out.println("Ingrese tipo del recurso a agregar");
                                    System.out.println("1. Libros\n2. Artículos\n3. Cursos\n4.Conferencia\n5. Salir");
                                    int type=leer.nextInt();
                                        while (type!=5){
                                            switch (type){
                                                
                                        case 1:
                                            String titulo="";
                                            String autor="";
                                            String genero="";
                                            String año="";
                                            String disponible="";
                                            int disponibilidad=0;
                                            leer.nextLine();
                                            System.out.println("Ingrese título:");
                                            titulo=leer.nextLine();
                                            System.out.println("Ingrese autor:");
                                            autor=leer.nextLine();
                                            System.out.println("Ingrese género:");
                                            genero=leer.nextLine();
                                            System.out.println("Ingrese año de publicación:");
                                            año=leer.nextLine();
                                            System.out.println("¿Se encuentra disponible?");
                                            System.out.println("1. Sí\n2. No");
                                            while(disponibilidad!=1&&disponibilidad!=2){
                                            disponibilidad=leer.nextInt();
                                                if (disponibilidad==1){
                                                disponible="Sí";
                                                libros.add(new Libros(titulo, autor, genero, año, disponible));
                                            }else if(disponibilidad==2){
                                                disponible="No";
                                                libros.add(new Libros(titulo, autor, genero, año, disponible));
                                            }
                                                }
                                            break;
                                            
                                        case 2:
                                            leer.nextLine();
                                             titulo="";
                                             autor="";
                                            String tema="";
                                            String fecha="";
                                             disponible="";
                                             disponibilidad=0;
                                            System.out.println("Ingrese título:");
                                            titulo=leer.nextLine();
                                            System.out.println("Ingrese autor:");
                                            autor=leer.nextLine();
                                            System.out.println("Ingrese tema:");
                                            tema=leer.nextLine();
                                            System.out.println("Ingrese fecha de publicación:");
                                            fecha=leer.nextLine();
                                            System.out.println("¿Se encuentra disponible?");
                                            System.out.println("1. Sí\n2. No");
                                            while(disponibilidad!=1&&disponibilidad!=2){
                                                disponibilidad=leer.nextInt();
                                            if (disponibilidad==1){
                                                disponible="Sí";
                                                articulos.add(new Articulos(titulo, autor, tema, fecha, disponible));
                                            }else if(disponibilidad==2){
                                                disponible="No";
                                                articulos.add(new Articulos(titulo, autor, tema, fecha, disponible));
                                            }
                                                }
                                            break;
                                            
                                        case 3:
                                            leer.nextLine();
                                            titulo="";
                                             String instructor="";
                                            int duracion;
                                            String plataforma="";
                                            System.out.println("Ingrese título:");
                                            titulo=leer.nextLine();
                                            System.out.println("Ingrese autor:");
                                            autor=leer.nextLine();
                                            System.out.println("Ingrese duración en semanas:");
                                            duracion=leer.nextInt();
                                            System.out.println("Ingrese plataforma de enseñanza:");
                                            leer.nextLine();
                                            plataforma=leer.nextLine();
                                            cursos.add(new Cursos (titulo, instructor, duracion, plataforma));
                                            break;
                                            
                                        case 4:
                                            leer.nextLine();
                                            titulo="";
                                             String conferencista="";
                                             duracion=0;
                                            String enlace="";
                                            fecha="";
                                            System.out.println("Ingrese título:");
                                            titulo=leer.nextLine();
                                            System.out.println("Ingrese conferencista:");
                                            conferencista=leer.nextLine();
                                            System.out.println("Ingrese fecha de actividad:");
                                            fecha=leer.nextLine();
                                            System.out.println("Ingrese duración en horas:");
                                            duracion=leer.nextInt();
                                            System.out.println("Ingrese enlace de acceso:");
                                            leer.nextLine();
                                            enlace=leer.nextLine();
                                            conferencias.add(new Conferencias(titulo, conferencista, fecha, duracion, enlace));
                                            
                                            break;
                                            
                                            
                                    }
                                            System.out.println("Ingrese tipo del recurso a agregar");
                                    System.out.println("1. Libros\n2. Artículos\n3. Cursos\n4.Conferencia\n5. Salir");
                                     type=leer.nextInt();
                                    }
                                break;
                                
                                case 3:
                                    System.out.println("Ingrese tipo a eliminar");
                                    System.out.println("");
                                    System.out.println("1. Libros\n2. Artículos\n3. Cursos\n4.Conferencia\n5. Salir");
                                    type=0;
                                    while (type!=5){
                                        type=leer.nextInt();
                                    if (type==1){
                                            System.out.println("");
                                            System.out.println("Libros");
                                            System.out.println("");
                                            for (Libros l : libros) {
                                                System.out.println(libros.indexOf(l)+1+".  "+l.ToString());
                                            }
                                            System.out.println("Ingrese posición");
                                            int pos=leer.nextInt();
                                            if (pos>=0&&pos<libros.size()){
                                            libros.remove(pos);
                                            }else{
                                                System.out.println("Posición inexistente");
                                            }
                                     
                                    }else if(type==2){
                                        System.out.println("");
                                            System.out.println("Artículos");
                                            System.out.println("");
                                            System.out.println("");
                                            System.out.println("Artículos");
                                            System.out.println("");
                                            for (Articulos a : articulos) {
                                                System.out.println(articulos.indexOf(a)+1+".  "+a.ToString());
                                            }
                                            System.out.println("Ingrese posición");
                                            int pos=leer.nextInt();
                                            if (pos>=0&&pos<articulos.size()){
                                               articulos.remove(pos);
                                            }else{
                                                System.out.println("Posición inexistente");
                                            }
                                    }else if (type==3){
                                        System.out.println("");
                                        System.out.println("Cursos en Línea");
                                        System.out.println("");
                                        for (Cursos c : cursos) {
                                            System.out.println(cursos.indexOf(c)+1+".  "+c.ToString());
                                        }
                                        System.out.println("Ingrese posición");
                                            int pos=leer.nextInt();
                                            if (pos>=0&&pos<cursos.size()){
                                                cursos.remove(pos);
                                            }else{
                                                System.out.println("Posición inexistente");
                                            }
                                    }else if(type==4){
                                        System.out.println("");
                                        System.out.println("Conferencias Virtuales");
                                        System.out.println("");
                                        for (Conferencias co : conferencias) {
                                            System.out.println(conferencias.indexOf(co)+1+".  "+co.ToString());
                                        }
                                        System.out.println("Ingrese posición");
                                            int pos=leer.nextInt();
                                            if (pos>=0&&pos<conferencias.size()){
                                                conferencias.remove(pos);
                                            }else{
                                                System.out.println("Posición inexistente");
                                            }
                                    }
                                    leer.nextLine();
                                    System.out.println("1. Libros\n2. Artículos\n3. Cursos\n4.Conferencia\n5. Salir");
                                    System.out.println("1. Libros\n2. Artículos\n3. Cursos\n4.Conferencia\n5. Salir");
                                    type=leer.nextInt();  
                                    
                                    }
                                    
                                    
                                break;
                                
                                case 4:
                                    System.out.println("Ingrese tipo a modificar");
                                    System.out.println("");
                                    System.out.println("1. Libros\n2. Artículos\n3. Cursos\n4.Conferencia\n5. Salir");
                                    type=0;
                                    while (type!=5){
                                        type=leer.nextInt();
                                    if (type==1){
                                            System.out.println("");
                                            System.out.println("Libros");
                                            System.out.println("");
                                            for (Libros l : libros) {
                                                System.out.println(libros.indexOf(l)+1+".  "+l.ToString());
                                            }
                                            System.out.println("Ingrese posición");
                                            int pos=leer.nextInt();
                                            if (pos>=0&&pos<libros.size()){
                                                String titulo="";
                                            String autor="";
                                            String genero="";
                                            String año="";
                                            String disponible="";
                                            int disponibilidad=0;
                                            leer.nextLine();
                                            System.out.println("Ingrese título:");
                                            titulo=leer.nextLine();
                                            libros.get(pos).settitle(titulo);
                                            System.out.println("Ingrese autor:");
                                            autor=leer.nextLine();
                                            libros.get(pos).setauthor(autor);
                                            System.out.println("Ingrese género:");
                                            genero=leer.nextLine();
                                            libros.get(pos).setgenre(genero);
                                            System.out.println("Ingrese año de publicación:");
                                            año=leer.nextLine();
                                            libros.get(pos).setyear(año);
                                            System.out.println("¿Se encuentra disponible?");
                                            System.out.println("1. Sí\n2. No");
                                            
                                            disponibilidad=leer.nextInt();
                                                if (disponibilidad==1){
                                                disponible="Sí";
                                                libros.get(pos).setaccess(disponible);
                                            }else if(disponibilidad==2){
                                                disponible="No";
                                                libros.get(pos).setaccess(disponible);
                                            }
                                                
                                            
                                            }else{
                                                System.out.println("Posición inexistente");
                                            }
                                     
                                    }else if(type==2){
                                        System.out.println("");
                                            System.out.println("Artículos");
                                            System.out.println("");
                                            System.out.println("");
                                            System.out.println("Artículos");
                                            System.out.println("");
                                            for (Articulos a : articulos) {
                                                System.out.println(articulos.indexOf(a)+1+".  "+a.ToString());
                                            }
                                            System.out.println("Ingrese posición");
                                            int pos=leer.nextInt();
                                            if (pos>=0&&pos<articulos.size()){
                                                leer.nextLine();
                                             String titulo="";
                                             String autor="";
                                            String tema="";
                                            String fecha="";
                                             String disponible="";
                                             int disponibilidad=0;
                                            System.out.println("Ingrese título:");
                                            titulo=leer.nextLine();
                                            articulos.get(pos).settitle(titulo);
                                            System.out.println("Ingrese autor:");
                                            autor=leer.nextLine();
                                            articulos.get(pos).setauthor(autor);
                                            System.out.println("Ingrese tema:");
                                            tema=leer.nextLine();
                                            articulos.get(pos).settheme(tema);
                                            System.out.println("Ingrese fecha de publicación:");
                                            fecha=leer.nextLine();
                                            articulos.get(pos).setDate(fecha);
                                            System.out.println("¿Se encuentra disponible?");
                                            System.out.println("1. Sí\n2. No");
                                            while(disponibilidad!=1&&disponibilidad!=2){
                                                disponibilidad=leer.nextInt();
                                            if (disponibilidad==1){
                                                disponible="Sí";
                                                articulos.get(pos).setaccess(disponible);
                                            }else if(disponibilidad==2){
                                                disponible="No";
                                                articulos.get(pos).setaccess(disponible);
                                            }
                                                
                                            }
                                    }else{
                                                System.out.println("Posición inexistente");
                                            }
                                    }else if (type==3){
                                        System.out.println("");
                                        System.out.println("Cursos en Línea");
                                        System.out.println("");
                                        for (Cursos c : cursos) {
                                            System.out.println(cursos.indexOf(c)+1+".  "+c.ToString());
                                        }
                                        System.out.println("Ingrese posición");
                                            int pos=leer.nextInt();
                                            if (pos>=0&&pos<cursos.size()){
                                                leer.nextLine();
                                            String titulo="";
                                             String instructor="";
                                             String autor;
                                            int duracion;
                                            String plataforma="";
                                            System.out.println("Ingrese título:");
                                            titulo=leer.nextLine();
                                            cursos.get(pos).settitle(titulo);
                                            System.out.println("Ingrese autor:");
                                            autor=leer.nextLine();
                                            cursos.get(pos).setinstructor(autor);
                                            System.out.println("Ingrese duración en semanas:");
                                            duracion=leer.nextInt();
                                            cursos.get(pos).settime(duracion);
                                            System.out.println("Ingrese plataforma de enseñanza:");
                                            leer.nextLine();
                                            plataforma=leer.nextLine();
                                            cursos.get(pos).setplat(plataforma);
                                            
                                            }else{
                                                System.out.println("Posición inexistente");
                                            }
                                    }else if(type==4){
                                        System.out.println("");
                                        System.out.println("Conferencias Virtuales");
                                        System.out.println("");
                                        for (Conferencias co : conferencias) {
                                            System.out.println(conferencias.indexOf(co)+1+".  "+co.ToString());
                                        }
                                        System.out.println("Ingrese posición");
                                            int pos=leer.nextInt();
                                            if (pos>=0&&pos<conferencias.size()){
                                                leer.nextLine();
                                                String titulo="";
                                             String conferencista="";
                                             int duracion=0;
                                            String enlace="";
                                            String fecha="";
                                            System.out.println("Ingrese título:");
                                            titulo=leer.nextLine();
                                            conferencias.get(pos).settitle(titulo);
                                            System.out.println("Ingrese conferencista:");
                                            conferencista=leer.nextLine();
                                            conferencias.get(pos).setinstructor(conferencista);
                                            System.out.println("Ingrese fecha de actividad:");
                                            fecha=leer.nextLine();
                                            conferencias.get(pos).setdate(fecha);
                                            System.out.println("Ingrese duración en horas:");
                                            duracion=leer.nextInt();
                                            conferencias.get(pos).settime(duracion);
                                            System.out.println("Ingrese enlace de acceso:");
                                            leer.nextLine();
                                            enlace=leer.nextLine();
                                            conferencias.get(pos).setlink(enlace);
                                                
                                    }else{
                                                System.out.println("Posición inexistente");
                                            }
                                    }
                                    leer.nextLine();
                                    System.out.println("1. Libros\n2. Artículos\n3. Cursos\n4.Conferencia\n5. Salir");
                                    type=leer.nextInt();  
                                    }
                                    
                           
                                
                                
                       }
                        leer.nextLine();
                        System.out.println("");
                        System.out.println("*********OPCIONES*********\n" +
"1.	Listar recursos\n" +
"2.	Crear recurso\n" +
"3.	Eliminar recurso\n" +
"4.	Modificar recurso\n" +
"5.	Salir");
                        opcion=leer.nextInt();
                        }
                        
                        
                    }
                }
            System.out.println("Desea continuar?");
            resp=leer.next().charAt(0);
            if (resp!='n'){
            leer.nextLine();
                System.out.println("*********************UNIVERSIDAD VIRTUAL*********************");
        System.out.println("");
        System.out.println("INICIO DE SESIÓN:");
        System.out.println("Ingrese su cuenta");
        cuenta=leer.nextLine();
        System.out.println("Ingrese contraseña");
        pass=leer.nextLine();
            }
        }//FIN WHILE
        
        
    }//FIN MAIN
    
    
    }
    
//FIN CLASE
