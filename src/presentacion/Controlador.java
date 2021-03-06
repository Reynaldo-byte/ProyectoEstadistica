/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Cheetos, Calec y Alejandro
 */
public class Controlador implements MouseListener {

    private final Vista vista;

    public Controlador(Vista aThis) {
        vista = aThis;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (vista.getModelo().getLogica().getLista().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay datos en la Muestra");
        } else {
            vista.getModelo().enviarMedia();
            vista.getModelo().enviarMediana();
            vista.getModelo().enviarModa();
            vista.getModelo().enviarVarianza();
            vista.getModelo().enviarDesviacion();
            vista.crearGrafica();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
