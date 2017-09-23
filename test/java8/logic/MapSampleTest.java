package java8.logic;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.Test;
import junit.framework.TestCase;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.NonStrictExpectations;

public class MapSampleTest extends TestCase {

	/**
	 * publicメソッドの返り値をモック化したテストメソッド
	 */
	@Test
	public void test() {
		final MapSample sample = new MapSample();
		System.out.println(sample.getInt());
		new MockUp<MapSample>() {
		      @Mock(invocations = 1)
		      public int getInt() {
		        return 20;
		      }
		    };
	   System.out.println(sample.getInt());
	}
	
	/**
	 * privateメソッドのテストメソッド
	 * @throws Exception
	 */
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
	
	@Mocked
	private AbstractBase _abstractBase;

	/**
	 * なぜか失敗する・・・
	 * @throws Exception
	 */
	@Test(expected= IllegalStateException.class)
	public void test3_1() throws Exception {
		new NonStrictExpectations() {{
	    	_abstractBase.main1();result = null;
        }};
		System.out.println(this._abstractBase.main1());
	}

	/**
	 * abstractクラスのメソッドをモック化したテストメソッド
	 * @throws Exception
	 */
	@Test
	public void test3_2() throws Exception {
		final MapSample sample = new MapSample();
		new MockUp<AbstractBase>() {
	      @Mock(invocations = 1)
	      public String main1() {
	        return "TEST MOCK";
	      }
		};
		System.out.println(sample.main1());
	}
	
}