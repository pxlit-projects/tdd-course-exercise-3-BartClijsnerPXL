package be.pxl.tdd;

/**
 * Created by bart on 20/02/2017.
 */
public class Cell {
	String value = "";

	public Cell () {
	}

	public Cell (String value) {
		this.value = value;
	}

	public String getValue () {
		return value;
	}

	public void setValue (String value) {
		this.value = value;
	}

}
