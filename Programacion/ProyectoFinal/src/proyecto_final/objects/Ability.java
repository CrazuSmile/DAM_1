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
    private boolean isHidden;
    private int slot;

    public Ability(int abilID, String abilName) {
        this.setAbilID(abilID);
        this.setAbilName(abilName);
    }

    public Ability(String abilName, boolean isHidden, int slot) {
        this.abilName = abilName;
        this.isHidden = isHidden;
        this.slot = slot;
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

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    @Override
    public String toString() {
        return this.getAbilID() + " - " + this.getAbilName();
    }
}
