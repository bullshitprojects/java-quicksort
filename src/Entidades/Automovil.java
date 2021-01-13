/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import Entidades.Reparacion;

/**
 *
 * @author juliocanizalez
 */
public class Automovil {

    public int id_automovil;
    public int placa;
    public ArrayList<Reparacion> lista_reparacion = new ArrayList<>();
    public Reparacion r;
    public double tR;
    public void generarReparacion() {
        for (int i = 0; i < 10; i++) {
            r = new Reparacion();
            r.id_reparacion = i+1;
            r.monto = Math.round(Math.random() * 323);
            lista_reparacion.add(r);
            tR+= r.monto;
        }
    }
}
