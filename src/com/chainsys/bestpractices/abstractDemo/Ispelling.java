package com.chainsys.bestpractices.abstractDemo;

public interface Ispelling {
	void spellCheck(String word);

	void checkGrammar(String sentence);

	int wordCount(String sentence);

}

/*
 * abstract class Language implements Ispelling{
 * 
 * @Override String[] word= sentence.split(" "); return words.length; }
 */
//public int wordCount(String sentence) {

class EnglishLanguage implements Ispelling {

	@Override
	public void spellCheck(String word) {

		System.out.println("Engllish Spell Checker");
	}

	@Override
	public void checkGrammar(String sentence) {
		System.out.println("English Grammar");
	}

	@Override
	public int wordCount(String sentence) {
		String[] words = sentence.split(" ");
		return 0;
	}

	class TamilLanguage implements Ispelling {

		@Override
		public void spellCheck(String word) {

			System.out.println("Tamil Spell Checker");
		}

		@Override
		public void checkGrammar(String sentence) {
			System.out.println("Tamil Grammar");
		}

		@Override
		public int wordCount(String sentence) {
			String[] words = sentence.split(" ");
			return 0;
		}

		class FrenchLanguage implements Ispelling {

			@Override
			public void spellCheck(String word) {

				System.out.println("French Spell Checker");
			}

			@Override
			public void checkGrammar(String sentence) {
				System.out.println("French Grammar");
			}

			@Override
			public int wordCount(String sentence) {
				String[] words = sentence.split(" ");
				return 0;
			}
		}
	}
}
