package test.curriculum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.curriculum.CurriculumBeanDao;

public class TestCurriculumBeanDao5 {

  CurriculumBeanDao cbd = new CurriculumBeanDao();
  int confronto = 7;

  @Test
  public void testdoRetriveByIdMaggiore() {

    assertEquals(confronto, cbd.doRetrieveByIdMaggiore());

  }
}
