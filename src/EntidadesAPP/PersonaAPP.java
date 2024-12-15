/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesAPP;

/**
 *
 * @author allan
 */
public class PersonaAPP {
    private String NombreAPP;
    private String EdadAPP;
    private String DireccionAPP;
    private String TelefonoAPP;

    public PersonaAPP(String NombreAPP, String EdadAPP, String DireccionAPP, String TelefonoAPP) {
        this.NombreAPP = NombreAPP;
        this.EdadAPP = EdadAPP;
        this.DireccionAPP = DireccionAPP;
        this.TelefonoAPP = TelefonoAPP;
    }

    public String getNombreAPP() {
        return NombreAPP;
    }

    public void setNombreAPP(String NombreAPP) {
        this.NombreAPP = NombreAPP;
    }

    public String getEdadAPP() {
        return EdadAPP;
    }

    public void setEdadAPP(String EdadAPP) {
        this.EdadAPP = EdadAPP;
    }

    public String getDireccionAPP() {
        return DireccionAPP;
    }

    public void setDireccionAPP(String DireccionAPP) {
        this.DireccionAPP = DireccionAPP;
    }

    public String getTelefonoAPP() {
        return TelefonoAPP;
    }

    public void setTelefonoAPP(String TelefonoAPP) {
        this.TelefonoAPP = TelefonoAPP;
    }
    
    
}
