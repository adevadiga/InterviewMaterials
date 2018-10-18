import org.junit.Test;


public class KeyPadTest {

	@Test
	public void printAllWordsTest(){
		KeyPad pad = new KeyPad();
		//pad.printAllWords("234");
		new KeyPadEff().printWords("23");
	}
}
