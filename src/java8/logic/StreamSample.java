package java8.logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8.Const;
import java8.model.MobileSuitModel;
import java8.model.PilotModel;


/**
 * streamのサンプルクラス
 * @author n_sekiya
 */
public class StreamSample {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		
		final int value = 7;
		System.out.println("---START---");
		switch(value) {
			case 1:
				sample1();
				break;
			case 2:
				sample2();
				break;
			case 3:
				sample3();
				break;
			case 4:
				sample4();
				break;
			case 5:
				sample5();
				break;
			case 6:
				sample6();
				break;
			case 7:
				sample7();
				break;
			case 8:
				sample8();
				break;
			case 9:
				sample9();
				break;
			case 10:
				sample10();
				break;
		}
		System.out.println("---END---");
	}

	/**
	 * カンマ区切りの文字列を出力する
	 */
	private static void sample1() {
		// カンマ区切りの文字列をStreamに変換
		Stream<String> stream = Stream.of((Const.GUMDAM_W.STRING).split(","));
		// streamを出力
		stream.forEach(ms -> System.out.println(ms));
	}

	/**
	 * 配列を出力する
	 */
	private static void sample2() {
		// 配列をStreamに変換
		Stream<String> stream = Stream.of(Const.GUMDAM_W.COLLECTION);
		// streamを出力
		stream.map(ms -> "[" + ms + "]").forEach(System.out::println);
	}

	/**
	 * カンマ区切りの文字列をリストに追加して出力する
	 */
	private static void sample3() {
		// カンマ区切りの文字列をStreamに変換
		Stream<String> stream = Pattern.compile(",").splitAsStream(Const.GUMDAM_W.STRING);
/* 外部の変数を使うのではなく新しく生成して使用した方がいい */
//		List<String> list = new ArrayList<>();
//		// Streamをlistに追加
//		stream.forEach(ms -> list.add(ms));
		List<String> list = stream.collect(Collectors.toList());
		// listを出力
		for (String ms : list) {
			System.out.println(ms);
		}
	}

	/**
	 * リストから新しく作成したリストにコピーする
	 */
	private static void sample4() {
		Function<String, String> function = (str1 -> str1);
		List<String> list = Const.G_GUMDAM.LIST.stream().map(function).collect(Collectors.toList());
		list.stream().forEach(str -> System.out.println(str));
	}

	/**
	 * 指定した頭文字から始まる文字列をカウントする
	 */
	private static void sample5() {
		// 頭文字がガンダムから始まる文字列をカウントする
		Long count = Const.G_GUMDAM.LIST.stream().filter(ms -> ms.startsWith(Const.GUMDAM.GUMDAM)).count();
		System.out.println(count);
	}

	private static void sample6() {
/* ----------------------------------------------------------------------------------------- */
		Function<MobileSuitModel, String> function = (ms -> ms.getName());
		List<String> actual = Stream.of(Const.GUMDAM_W.getModel().getMobileSuitModel())
				.map(function).collect(Collectors.toList());
		actual.forEach(action -> System.out.println(action));
/* ----------------------------------------------------------------------------------------- */
		List<ProfileModel> profList = new ArrayList<>();
		profList.add(setModel("キラ", "090-xxxx-yyyy", "kira@xxx.xxx"));
		profList.add(setModel("アスラン", "080-xxxx-yyyy", "asuran@xxx.xxx"));
		profList.add(setModel("カガリ", "070-xxxx-yyyy", "kagari@xxx.xxx"));
		Function<ProfileModel, NameModel> func =
				(list -> new NameModel(list.getName() + ":" + list.getTel() + "：" + list.getEmail()));
		List<NameModel> actual2 =
				profList.stream().map(func).collect(Collectors.toList());
		actual2.forEach(action2 -> System.out.println(action2.getName()));
/* ----------------------------------------------------------------------------------------- */
	}
	private static ProfileModel setModel(String name, String tel, String email) {
		ProfileModel prof = new ProfileModel();
		prof.setName(name);
		prof.setTel(tel);
		prof.setEmail(email);
		return prof;
	}

	public static final class NameModel {
		private String name;

		NameModel(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static final class ProfileModel {

		private String name;
		private String tel;
		private String email;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	}

	private static Map<Integer, Map<Integer, PilotModel>> sample7() {
		List<PilotModel> list = new ArrayList();
		return list.stream()
//				.sorted(Comparator.comparing(PilotModel::getGender))
				.collect(Collectors.groupingBy(PilotModel::getGender,
						Collectors.toMap(PilotModel::getGender, model -> model)));
	}

	private static void  sample8() {
		List<PilotModel> list = new ArrayList();
		
		// LinkedHashSet<PilotModel>
		list.stream().collect(Collectors.toCollection(LinkedHashSet::new));

		// LinkedHashMap<String, PilotModel>
		list.stream().collect(Collectors.toMap(
				PilotModel::getName, model -> model,
				(u, v) -> v, LinkedHashMap::new));
		
		List<Map<String, PilotModel>> s3 = list.stream().collect(
				//
				 Collectors.mapping(
						 Collectors.toMap(PilotModel::getName, model -> model)
						 , Collectors.toList())
				//
				);

	}

	private static void sample9() {

	}

	private static void sample10() {

	}

}
