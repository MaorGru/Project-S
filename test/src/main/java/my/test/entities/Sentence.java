package my.test.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sentence implements ISentence {
	@Autowired
	private IWord word;
	
	private int id;
	private String text;
	
	public Sentence(){};
	
	public Sentence(String text) {
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void countWords() {
		 System.out.println("Sentence: "+text.length());
		 word.setText(text);
		 word.countLetters();
	}
	
	
}
