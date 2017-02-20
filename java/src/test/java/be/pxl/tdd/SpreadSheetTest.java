package be.pxl.tdd;

import be.pxl.tdd.exception.IllegalColumnIndexException;
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
    public void is_number () throws Exception {
        assertThat (sheet.isNumber ("1")).isEqualTo (true);
        assertThat (sheet.isNumber ("A")).isEqualTo (false);
        assertThat (sheet.isNumber ("2A")).isEqualTo (false);
    }

    @Test(expected = IllegalColumnIndexException.class)
    public void column_index_1_should_throw_exception () throws Exception {
        sheet.validateColumnIndex ("1");
    }
    @Test(expected = IllegalColumnIndexException.class)
    public void column_index_1A_should_throw_exception () throws Exception {
        sheet.validateColumnIndex ("1A");
    }

    @Test(expected = IllegalColumnIndexException.class)
    public void getCell_with_column_index_1_should_throw_exception () throws Exception {
        sheet.getCell(4,"1");
    }

    @Test(expected = IllegalColumnIndexException.class)
    public void getCell_with_column_index_2A_should_throw_exception () throws Exception {
        sheet.getCell(4,"2A");
    }

    @Test
    public void cell_value_default_empty () throws Exception {
        Cell cell = new Cell();
        assertThat(cell.getValue ()).isEqualTo ("");
    }

    @Test
    public void cell_with_initial_value () throws Exception {
        Cell cell = new Cell("Some value");
        assertThat(cell.getValue()).isEqualTo ("Some value");
    }
    @Test
    public void cell_should_be_able_to_set_value () throws Exception {
        Cell cell = new Cell();
        cell.setValue ("Some value");
        assertThat(cell.getValue()).isEqualTo ("Some value");
    }
}