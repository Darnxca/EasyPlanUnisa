package test.esami;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;
import model.esame.EsameBeanDao;
import org.junit.Test;





public class TestEsameBeanDaodoRetrieveLastId {

  private EsameBeanDao esameDao = new EsameBeanDao();

  @SuppressWarnings("resource")
  @Test
  public void testdoRetrieveLastId() {

    Scanner in = new Scanner(System.in);
    System.out.print("Qual' è l'id dell'ultimo esame presente nel database? ");
    int numeriEsami = in.nextInt();

    assertEquals(numeriEsami, esameDao.doRetrieveLastId());
  }
}
