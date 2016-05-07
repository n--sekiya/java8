package java8.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.stream.Stream;
import java8.Const;

/**
 * try-with-resourcesのサンプルクラス
 * @author n_sekiya
 */
public class TryWithResourcesSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--------------------------------------");
		sample1();
		System.out.println("--------------------------------------");
		sample2();
		System.out.println("--------------------------------------");
		sample3();
		System.out.println("--------------------------------------");
	}

	/**
	 * InputStreamのtry-with-resources文
	 */
	private static void sample1() {
		try (InputStream is = new FileInputStream(new File(Const.PATH))) {
			// InputStreamでなんらかの処理
			System.out.println("InputStreamでなんらかの処理");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * BufferedReaderのtry-with-resources文
	 */
	private static void sample2() {
		try (BufferedReader fr = new BufferedReader(new FileReader(Const.PATH))) {
		} catch (Exception e) {
			// BufferedReaderで何らかの処理
			System.out.println("BufferedReaderで何らかの処理");
			System.out.println(e);
		}
	}

	/**
	 * Streamのtry-with-resources文
	 */
	private static void sample3() {
		try (Stream<String> lines = Files.lines(new File(Const.PATH).toPath())) {
			// Stream<String>でなんらかの処理
			System.out.println("Stream<String>でなんらかの処理");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
