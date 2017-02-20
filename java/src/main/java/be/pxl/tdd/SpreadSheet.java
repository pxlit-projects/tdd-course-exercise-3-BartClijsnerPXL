package be.pxl.tdd;

import be.pxl.tdd.exception.IllegalColumnIndexException;

import java.util.ArrayList;
import java.util.List;


public class SpreadSheet {

	private List<Row> rows;

	public SpreadSheet () {
		this.rows = new ArrayList<> ();
	}

	public List<Row> getRows () {
		return rows;
	}

	public Row getRow(int index) {
		return rows.get (index);
	}

	public void getCell (int rowIndex, String columnIndex) throws IllegalColumnIndexException {
		validateColumnIndex(columnIndex);
	}

	boolean validateColumnIndex (String columnIndex) throws IllegalColumnIndexException {
		for(char c : columnIndex.toCharArray ()) {
			if(isNumber (String.valueOf (c))) { throw new IllegalColumnIndexException ();}
		}
		return true;
	}

	public boolean isNumber (String value) {
		try {
			Integer.parseInt (value);
		} catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
}
