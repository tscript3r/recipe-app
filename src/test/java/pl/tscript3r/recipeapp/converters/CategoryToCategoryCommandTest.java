package pl.tscript3r.recipeapp.converters;

import org.junit.Before;
import org.junit.Test;
import pl.tscript3r.recipeapp.commands.CategoryCommand;
import pl.tscript3r.recipeapp.model.Category;

import static org.junit.Assert.*;

public class CategoryToCategoryCommandTest {

    public static final String ID_VALUE = "1";
    public static final String DESCRIPTION = "descript";
    CategoryToCategoryCommand convter;

    @Before
    public void setUp() throws Exception {
        convter = new CategoryToCategoryCommand();
    }

    @Test
    public void testNullObject() throws Exception {
        assertNull(convter.convert(null));
    }

    @Test
    public void testEmptyObject() throws Exception {
        assertNotNull(convter.convert(new Category()));
    }

    @Test
    public void convert() throws Exception {
        //given
        Category category = new Category();
        category.setId(ID_VALUE);
        category.setDescription(DESCRIPTION);

        //when
        CategoryCommand categoryCommand = convter.convert(category);

        //then
        assertEquals(ID_VALUE, categoryCommand.getId());
        assertEquals(DESCRIPTION, categoryCommand.getDescription());

    }

}