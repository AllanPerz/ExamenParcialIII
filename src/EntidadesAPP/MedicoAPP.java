/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesAPP;

/**
 *
 * @author allan
 */
public class MedicoAPP extends PersonaAPP{
    private String EspecialidadAPP;
    private Integer AniosExperienciaAPP;

    public MedicoAPP(String EspecialidadAPP, Integer AniosExperienciaAPP, String NombreAPP, String EdadAPP, String DireccionAPP, String TelefonoAPP) {
        super(NombreAPP, EdadAPP, DireccionAPP, TelefonoAPP);
        this.EspecialidadAPP = EspecialidadAPP;
        this.AniosExperienciaAPP = AniosExperienciaAPP;
    }

    public String getEspecialidadAPP() {
        return EspecialidadAPP;
    }

    public void setEspecialidadAPP(String EspecialidadAPP) {
        this.EspecialidadAPP = EspecialidadAPP;
    }

    public Integer getAniosExperienciaAPP() {
        return AniosExperienciaAPP;
    }

    public void setAniosExperienciaAPP(Integer AniosExperienciaAPP) {
        this.AniosExperienciaAPP = AniosExperienciaAPP;
    }

    
}
