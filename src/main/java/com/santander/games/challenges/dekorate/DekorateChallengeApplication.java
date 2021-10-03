package com.santander.games.challenges.dekorate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.dekorate.kubernetes.annotation.KubernetesApplication;
import io.dekorate.kubernetes.annotation.Port;


@SpringBootApplication
//@KubernetesApplication(name="dekorate-challenge",
//ports = @Port(name = "web", containerPort = 8080))
public class DekorateChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DekorateChallengeApplication.class, args);
	}

}
