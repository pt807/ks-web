package com.daejun.app;

import com.daejun.app.entity.Interests;
import com.daejun.app.entity.Person;
import com.daejun.app.entity.SocialMedia;
import com.daejun.app.repository.InterestsRepository;
import com.daejun.app.repository.PersonRepository;
import com.daejun.app.repository.SocialMediaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	private final PersonRepository personRepository;
	private final SocialMediaRepository socialMediaRepository;
	private final InterestsRepository interestsRepository;

	public AppApplication(PersonRepository personRepository, SocialMediaRepository socialMediaRepository, InterestsRepository interestsRepository) {
		this.personRepository = personRepository;
		this.socialMediaRepository = socialMediaRepository;
		this.interestsRepository = interestsRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("박대준", "데이터 분석", "hello@test.com", "010-1234-5678"));
		socialMediaRepository.save(new SocialMedia(" ", " ", "anonymous", "anonymous"));
		interestsRepository.save(new Interests("유튜브보기"));
		interestsRepository.save(new Interests("게임"));
	}
}