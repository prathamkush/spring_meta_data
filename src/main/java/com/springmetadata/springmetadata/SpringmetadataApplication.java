package com.springmetadata.springmetadata;

import com.springmetadata.springmetadata.configuration.RecommendedMovieImplemenation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class SpringmetadataApplication {
	public static void main(String[] args) {


		// Change from Application COntext to Configuration
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");

		System.out.println("Bean definition names");
		System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));


		RecommendedMovieImplemenation recommender = appContext.getBean("recommendedMovieImplementation", RecommendedMovieImplemenation.class);

		String[] movies = recommender.recommendedMovie("matrix");
		System.out.println(Arrays.toString(movies));




	}



}
