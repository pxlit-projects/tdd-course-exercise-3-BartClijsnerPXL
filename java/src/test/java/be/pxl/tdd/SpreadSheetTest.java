package be.pxl.tdd;

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
    public void should_have_unlimited_rows_and_columns() {
        assertThat(true).isNotEqualTo (true);
    }

    @Test
    public void row_should_be_number () throws Exception {
        Row row = sheet.getRow(67);
    }
    @Test
    public void row_should_not_be_string () throws Exception {
        Row row = sheet.getRow("AA");
    }
}