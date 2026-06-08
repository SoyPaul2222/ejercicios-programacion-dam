/*
* Vehicle.java 9 Apr 2026
*
*
* © Copyright 2026 Joan Sèculi <joan.seculi@gmail.com>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package polimorfisme1;

public abstract class Vehicle {
	private int x;
	private int y;
	
    // Constructor

	public Vehicle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Metode abstractes que les classes filles sobreescriuran
	// TODO

    // getters i setters
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x =x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
    // Mètode final que les classes no poden sobreescriure
    public final String copyRight() {
    	return "Joan Seculi";
    }

}
