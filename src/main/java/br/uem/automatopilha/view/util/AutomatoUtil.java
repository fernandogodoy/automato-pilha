package br.uem.automatopilha.view.util;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class AutomatoUtil {

	public static final List<String> toList(String palavra) {
		return new LinkedList<>(Arrays.asList(palavra.split("\\B")));
	}

	public static List<String> getFirstHalf(List<String> characters) {
		return characters.subList(0, characters.size() / 2);
	}

	public static List<String> getSecondHalf(List<String> characters) {
		return characters.subList(characters.size() / 2, characters.size());
	}

}
