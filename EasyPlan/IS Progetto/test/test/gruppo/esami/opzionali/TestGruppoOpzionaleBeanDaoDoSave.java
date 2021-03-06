package test.gruppo.esami.opzionali;

import static org.junit.Assert.assertEquals;

import model.gruppo.esami.GruppoEsamiOpzionaliBean;
import model.gruppo.esami.GruppoEsamiOpzionaliBeanDao;
import org.junit.Test;



public class TestGruppoOpzionaleBeanDaoDoSave {

  private GruppoEsamiOpzionaliBean gopz = new GruppoEsamiOpzionaliBean(121, 1, 25, 2, null);
  private GruppoEsamiOpzionaliBeanDao gopzDao = new GruppoEsamiOpzionaliBeanDao();

  @Test
  public void testDoSave() throws Exception {
    assertEquals(2, gopzDao.doSave(gopz));
  }
}
