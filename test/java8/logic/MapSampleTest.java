package java8.logic;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

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
	
	
	@Test
	public void test2() throws Exception {
		final MapSample sample = new MapSample();
//		Method method = Sample.class.getDeclaredMethod("<メソッド名>", 引数の型1, 引数の型2...);
		final Method method = MapSample.class.getDeclaredMethod("getHogehoge");
		method.setAccessible(true);
//		int actual = (戻り値の型)method.invoke(<インスタンス>,引数1,引数2...);
		String actual = (String) method.invoke(sample);
		System.out.println(actual);
	}
	
	
	
	
	
	
	
}
