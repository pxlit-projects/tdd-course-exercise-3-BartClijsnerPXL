package be.pxl.tdd;

import java.util.ArrayList;
import java.util.Collection;
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

	public Cell getCell (int rowIndex, String columnIndex) {

	}
}
