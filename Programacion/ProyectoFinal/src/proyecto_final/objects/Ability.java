/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final.objects;

/**
 *
 * @author jojos
 */
public class Ability {

    private int abilID;
    private String abilName;

    public Ability(int abilID, String abilName) {
        this.setAbilID(abilID);
        this.setAbilName(abilName);
    }

    public int getAbilID() {
        return abilID;
    }

    public final void setAbilID(int abilID) {
        this.abilID = abilID;
    }

    public String getAbilName() {
        return abilName;
    }

    public final void setAbilName(String abilName) {
        this.abilName = abilName;
    }

    @Override
    public String toString() {
        return this.getAbilID() + " - " + this.getAbilName();
    }
}
