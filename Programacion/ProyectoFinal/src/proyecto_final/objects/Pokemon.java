/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final.objects;

/**
 *
 * @author jojos
 */
public class Pokemon {

    private int pokID;
    private String pokName;
    private int pokHeight;
    private int pokWeight;
    private int pokBaseExperience;

    public Pokemon(int pokID, String pokName, int pokHeight, int pokWeight, int pokBaseExpercience) {
        this.setPokID(pokID);
        this.setPokName(pokName);
        this.setPokHeight(pokHeight);
        this.setPokWeight(pokWeight);
        this.setPokBaseExperience(pokBaseExperience);

    }

    public final void setPokID(int pokID) {
        /*      if (pokID == 0)
            throw new IllegalArgumentException("No se adite valor negativo.");*/
        this.pokID = pokID;
    }

    public final int getPokID() {
        return pokID;
    }

    public final String getPokName() {
        return pokName;
    }

    public final void setPokName(String pokName) {
        /* if (pokName == null)
            throw new IllegalArgumentException("No se adite un valor nulo.");*/
        this.pokName = pokName;
    }

    public final int getPokHeight() {
        return pokHeight;
    }

    public final void setPokHeight(int pokHeight) {
        //  if (pokHeight == 0)
        //     throw new IllegalArgumentException("No se adite valor negativo.");
        this.pokHeight = pokHeight;
    }

    public final int getPokWeight() {
        return pokWeight;
    }

    public final void setPokWeight(int pokWeight) {
        // if (pokWeight == 0)
        //    throw new IllegalArgumentException("No se adite valor negativo.");
        this.pokWeight = pokWeight;
    }

    public final int getPokBaseExperience() {
        return pokBaseExperience;
    }

    public final void setPokBaseExperience(int pokBaseExperience) {
        // if (pokBaseExperience == 0)
        //     throw new IllegalArgumentException("No se adite valor negativo.");
        this.pokBaseExperience = pokBaseExperience;
    }

    @Override
    public String toString() {
        return this.getPokName();
    }
}
