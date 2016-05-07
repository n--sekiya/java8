package common;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringJoiner;

import model.GundamModel;
import model.MobileSuitModel;
import model.PilotModel;

/**
 * 定数クラス
 * @author RIO
 */
public final class Const {

	public static final String PATH = "C:\\tech\\テキスト.txt";
	public static final Charset UTF8 = Charset.forName("UTF-8");

	public static final class GUMDAM {
		/** ガンダム */
		public static final String GUMDAM = "ガンダム";
	}

	public static final class GUMDAM_W {
		/** ウィングガンダム */
		public static final String WING = "ウィングガンダム";
		/** ガンダムデスサイズ */
		public static final String DEATHSCYTHE = "ガンダムデスサイズ";
		/** ガンダムヘビーアームズ */
		public static final String HEAVYARMS = "ガンダムヘビーアームズ";
		/** ガンダムサンドロック */
		public static final String SANDROCK = "ガンダムサンドロック";
		/** シェンロンガンダム */
		public static final String SHENLONG = "シェンロンガンダム";

		/** 文字列 */
		public static final String STRING = new StringJoiner(",").add(WING).add(DEATHSCYTHE).add(HEAVYARMS)
				.add(SANDROCK).add(SHENLONG).toString();
		/** リスト */
//		public static final List<String> LIST = Arrays.asList(WING, DEATHSCYTHE, HEAVYARMS, SANDROCK, SHENLONG);
		public static final List<String>  LIST =  new ArrayList<String>(){{
			add(WING);
			add(DEATHSCYTHE);
			add(HEAVYARMS);
			add(SANDROCK);
			add(SHENLONG);
		};};
		/** 配列 */
		public static final String[] COLLECTION = new String[] { WING, DEATHSCYTHE, HEAVYARMS, SANDROCK, SHENLONG };
		/** マップ */
		public static final HashMap<Integer, String> MAP = new HashMap<Integer, String>() {
			{
				put(1, WING);
				put(2, DEATHSCYTHE);
				put(3, HEAVYARMS);
				put(4, SANDROCK);
				put(5, SHENLONG);
			}
		};
		public static final GundamModel getModel() {
			GundamModel gundam = new GundamModel();
			MobileSuitModel[] ms = new MobileSuitModel[COLLECTION.length];
			PilotModel[] chara = new PilotModel[0];
			for (int i = 0; i < COLLECTION.length; i++) {
				ms[i] = new MobileSuitModel();
				ms[i].setName(COLLECTION[i]);
			}
//			LIST.stream().collect(new MobileSuitModel[10]).forEach(str -> System.out.println(str));

			gundam.setMobileSuitModel(ms);
			gundam.setPilotModel(chara);
			return gundam;
		}
	}

	public static final class G_GUMDAM {
		/** シャイニングガンダム */
		public static final String SHINING = "シャイニングガンダム";
		/** ガンダムマックスター */
		public static final String MAXTER = "ガンダムマックスター";
		/** ドラゴンガンダム */
		public static final String DRAGON = "ドラゴンガンダム";
		/** ガンダムローズ */
		public static final String ROSE = "ガンダムローズ";
		/** ボルトガンダム */
		public static final String BOLT = "ボルトガンダム";
		/** 文字列 */
		public static final String STRING = new StringJoiner(",").add(SHINING).add(MAXTER).add(DRAGON).add(ROSE)
				.add(BOLT).toString();
		/** リスト */
//		public static final List<String> LIST = Arrays.asList(SHINING, MAXTER, DRAGON, ROSE, BOLT);
		public static final List<String>  LIST =  new ArrayList<String>(){{
			add(SHINING);
			add(MAXTER);
			add(DRAGON);
			add(ROSE);
			add(BOLT);
		};};
		/** 配列 */
		public static final String[] COLLECTION = new String[] { SHINING, MAXTER, DRAGON, ROSE, BOLT };
		/** マップ */
		public static final HashMap<Integer, String> MAP = new HashMap<Integer, String>() {
			{
				put(1, SHINING);
				put(2, MAXTER);
				put(3, DRAGON);
				put(4, ROSE);
				put(5, BOLT);
			}
		};
	}
}
