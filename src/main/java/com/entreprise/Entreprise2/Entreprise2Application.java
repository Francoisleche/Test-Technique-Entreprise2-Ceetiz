package com.entreprise.Entreprise2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Entreprise2Application {

	public static void main(String[] args) {
		//SpringApplication.run(Entreprise2Application.class, args);
		if(args.length==3){
			AutoEntreprise auto = new AutoEntreprise(Integer.parseInt(args[2]),args[0],args[1]);
			System.out.println(auto.calculerImpot());
		}else if(args.length==4){
			Sas sas = new Sas(Integer.parseInt(args[2]),args[0],args[1],args[3]);
			System.out.println(sas.calculerImpot());
		}else{
			System.err.println("Syntax : java Impot 123 monentreprise 155000 OU BIEN java Impot 345 sas 855477 15rueMontmorency  ");
		}
	}

}
