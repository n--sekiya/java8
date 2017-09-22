package java8.logic;

import static org.junit.Assert.*;

import org.junit.Test;
import junit.framework.TestCase;
import mockit.Mock;
import mockit.MockUp;


public class MapSampleTest {

	@Test
	public void test() {
		MapSample sample = new MapSample();
//		sample.main(null);
		
		System.out.println(sample.getInt());
		
		new MockUp<MapSample>() {
		      @Mock(invocations = 1)
		      public int getInt() {
		        return 20;
		      }
		    };
		
		   System.out.println(sample.getInt());
		   
	}
}
