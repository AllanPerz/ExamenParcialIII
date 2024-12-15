/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesAPP;

/**
 *
 * @author allan
 */
public class PacienteAPP extends PersonaAPP{
    private Integer numeroHistorialAPP;
    private String EnfermedadAPP;

    public PacienteAPP(Integer numeroHistorialAPP, String EnfermedadAPP, String NombreAPP, String EdadAPP, String DireccionAPP, String TelefonoAPP) {
        super(NombreAPP, EdadAPP, DireccionAPP, TelefonoAPP);
        this.numeroHistorialAPP = numeroHistorialAPP;
        this.EnfermedadAPP = EnfermedadAPP;
    }

    public Integer getNumeroHistorialAPP() {
        return numeroHistorialAPP;
    }

    public void setNumeroHistorialAPP(Integer numeroHistorialAPP) {
        this.numeroHistorialAPP = numeroHistorialAPP;
    }

    public String getEnfermedadAPP() {
        return EnfermedadAPP;
    }

    public void setEnfermedadAPP(String EnfermedadAPP) {
        this.EnfermedadAPP = EnfermedadAPP;
    }

    
}
