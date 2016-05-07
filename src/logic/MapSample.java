package logic;

import common.Const;

/**
 * mapのサンプルクラス
 * @author n_sekiya
 */
public class MapSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--------------------------------------");
		sample1();
		System.out.println("--------------------------------------");
	}

	private static void sample1() {
		Const.GUMDAM_W.MAP.forEach((key, value) -> System.out.println(key + value));
	}

}
