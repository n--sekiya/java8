package java8.logic;

import java8.Const;

/**
 * mapのサンプルクラス
 * @author n_sekiya
 */
public abstract class AbstractBase {

	
	public String main1() {
		final String str = "public method";
		System.out.println(str);
		return str;
	}
	
	protected String main2() {
		final String str = "protected method";
		System.out.println(str);
		return str;
	}
	
	private String main3() {
		final String str = "private method";
		System.out.println(str);
		return str;
	}
	
}
