package java8.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalSample {

	
	
	public static void main() {
		final int value = 1;
		System.out.println("---START---");
		switch(value) {
			case 1:
				sample1();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
		}
		System.out.println("---END---");
	}
	private static void sample1() {
		String value = "俺がガンダムだ";
		Optional<String> optional = Optional.ofNullable(value);
		
		// 値が存在する時のみ実行される
		optional.ifPresent(v -> System.out.println(v));
		
		List<String> list = new ArrayList<>();
		// 値が存在する場合にリストに追加する
		optional.ifPresent(v -> list.add(v));
		optional.ifPresent(list::add);
		System.out.println(list.size());
		
	}

}



