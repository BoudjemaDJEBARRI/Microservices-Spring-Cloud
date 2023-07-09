package com.djeb;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.djeb.dao.CompanyRepository;
import com.djeb.entities.Company;

//Méthode 2 : pour exécuter 
@SpringBootApplication
public class ServiceCompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCompanyApplication.class, args);
	}
	
	//@Bean permet d'exécuter la méthode dès le démarage 
	@Bean
	CommandLineRunner start(CompanyRepository companyRepository) {
		return arg ->{
			Stream.of("A","B","C").forEach(cn->{
				companyRepository.save(new Company(null,cn,100+Math.random()*900));
			});
			// Autre manière d'ecrire des expressions Lamda
			// Méthode 1 : 
			companyRepository.findAll().forEach(System.out::println);
//			// Méthode 2 :
//			companyRepository.findAll().forEach(s->{
//				System.out.println(s.toString());
//			});
			
		};
	}

}


////Méthode 2 : pour exécuter 
//@SpringBootApplication
//public class ServiceCompanyApplication implements CommandLineRunner{
//
//	public static void main(String[] args) {
//		SpringApplication.run(ServiceCompanyApplication.class, args);
//	}
//	
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}
//
//}

