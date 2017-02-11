package my.test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import my.test.entities.ISentence;
import my.test.entities.IWord;

@Configuration
@ComponentScan(basePackages = "my.test")
public class AppConfig {
	@Autowired
	private IWord word;
	
	@Autowired
	private ISentence sentence;
	
}
