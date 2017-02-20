package be.pxl.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpreadSheetTest {

    SpreadSheet sheet;

    @Before
    public void setUp () throws Exception {
        sheet = new SpreadSheet ();

    }

    @Test
    public void name() throws Exception {
        assertThat(1 + 1).isEqualTo(2);
    }

    @Test
    public void cell_value_default_empty () throws Exception {
        Cell cell = sheet.getCell(4,"B");
        assertThat(cell.getValue ()).isEqualTo ("");
    }


}