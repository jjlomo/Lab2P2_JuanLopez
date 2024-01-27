/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_juanlopez;

/**
 *
 * @author jjlm1
 */
public class Usuarios {
    private String cuenta;
    private String contraseña;
    private String tipo;
    
    public Usuarios (String cuenta, String contraseña, String tipo){
        this.contraseña=contraseña;
        this.cuenta=cuenta;
        this.tipo=tipo;
    }
    
    public String getuser(){
        return cuenta;
    }
    public String getpass(){
        return contraseña;
    }
    public String gettype(){
        return tipo;
    }
    public void setuser(String cuenta){
        this.cuenta=cuenta;
    }
    public void setpass(String contraseña){
        this.contraseña=contraseña;
    }
    public void settype(String tipo){
        this.tipo=tipo;
    }
}
