/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7psp;

/**
 *
 * @author Óscar
 */
public class Lector extends Thread {

    Buzon buzon;

    public Lector(Buzon b) {
        super();
        buzon = b;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            buzon.leer();
        }
    }

}
