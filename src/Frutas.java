/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hewlett Packard
 */
public class Frutas extends Alimentos{
    public Frutas() {
        this.Energy=10;
        this.Satisfaccion=10;
        this.TiempoCarga= new Tiempo(0,0,30);

    }
    
    public Tiempo getTiempoCarga() {
        return TiempoCarga;
    }

    public int getEnergy() {
        return Energy;
    }

    public int getSatisfaccion() {
        return Satisfaccion;
    }
}
