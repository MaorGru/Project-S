package my.test.entities;

import org.springframework.stereotype.Component;

@Component
public class Word implements IWord {
	private int id;
	private String text;
	
	public Word(){
		
	};
	
	public Word(String text) {
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

	public void countLetters() {
		System.out.println("Word: "+text.length());
	}
}
