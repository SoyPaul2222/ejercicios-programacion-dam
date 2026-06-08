/*
* Game.java 9 Apr 2026
*
*
* © Copyright 2026 Joan Sèculi <joan.seculi@gmail.com>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package polimorfisme1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Game extends JPanel {

    private Vehicle vehicle;
    private Image circuitImage;

    public Game(Vehicle vehicle) {
        this.vehicle = vehicle;

        circuitImage = new ImageIcon("circuit.jpg").getImage();

        setFocusable(true);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_RIGHT:
                        //TODO
                        break;

                    case KeyEvent.VK_LEFT:
                    	//TODO
                        break;

                    case KeyEvent.VK_UP:
                    	//TODO
                        break;

                    case KeyEvent.VK_DOWN:
                    	//TODO
                        break;
                        
                    case KeyEvent.VK_T:
                    	//TODO
                        break;
                }

                repaint(); // redibuixa pantalla
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
    	 super.paintComponent(g);

	    // dibuixa el circuit
	    g.drawImage(circuitImage, 0, 0, getWidth(), getHeight(), null);

	    // vehicle
	    g.fillRect(vehicle.getX(), vehicle.getY(), 40, 40);

	    // info
	    g.drawString(vehicle.getClass().getSimpleName(), 1200, 20);
        g.drawString("X: " + vehicle.getX() + " Y: " + vehicle.getY(), 1200, 40);
        g.drawString(vehicle.copyRight(), 1200, 60);

    }

    public static void main(String[] args) {

        // CANVIA AQUÍ EL VEHICLE
        Vehicle v = new Car(50, 50, 4);
        // Vehicle v = new Moto(50, 50, 125);
        // Vehicle v = new Bike(50, 50);

        JFrame frame = new JFrame("Mini Joc Polimorfisme");
        Game game = new Game(v);

        frame.add(game);
        frame.setSize(1350, 724);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
