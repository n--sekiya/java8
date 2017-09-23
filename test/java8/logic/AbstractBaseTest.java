package java8.logic;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Rule;
import org.junit.Test;

import junit.framework.TestCase;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.integration.junit4.JMockit;
import mockit.internal.mockups.MockInvocation;

public class AbstractBaseTest  extends TestCase {

/*
public static T newUninitializedInstance(Class<? extends T> classToInstantiate)
コンストラクタを呼ばずにインスタンスを生成します。
abstractクラスやinterfaceの場合、abstractメソッドは空のインスタンスを生成します。
 */
	
	@Test
	public void testMain1() throws Exception{
//			Constructor c = B.class.getDeclaredConstructor(Object.class);
//			B b = (B) c.newInstance(new Object());

		Constructor<AbstractBase> constructor = AbstractBase.class.getDeclaredConstructor();
//		Constructor c = AbstractBase.class.getDeclaredConstructor(Object.class);
		constructor.setAccessible(true);
		AbstractBase b = (AbstractBase) constructor.newInstance("main1");
//		AbstractBase b = (AbstractBase) constructor.newInstance(new Object());
		System.out.println(b.main1());
			
//		Constructor<ReflectionSample> constructor = 
//				ReflectionSample.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		ReflectionSample rs = constructor.newInstance();
		
//		Constructor<AbstractBase> constructor = 
//				AbstractBase.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		AbstractBase rs = constructor.newInstance();
//		System.out.println(rs.main1());
//		System.out.println(rs.main2());
		
		
//		 new NonStrictExpectations(AbstractBase.class) {{
//		　　　　　Bar.hoge();　　　//1つ目のメソッド
//		　　　　　result = 1;
//		　　　　　Bar.hogehoge();　//2つ目のメソッド
//	　　　}};
		
//		JMockit.class
		
//		AbstractBase action = mock(AbstractBase.class, Mockito.CALLS_REAL_METHODS);
//		AbstractBase action = mock(AbstractBase.class);

		
//		AbstractBase base = new AbstractBase();
//		AbstractBase.main1();
//		main1();
	}

	@Test
	public void testMain2() {
//		main2();
	}

	@Test
	public void testMain3() {
//		main3();
	}

}
