package com.entreprise.Entreprise2;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

class Entreprise2ApplicationTests {

	@Test
	public void testImpotAutoEntreprise() {
		AutoEntreprise entreprise = new AutoEntreprise(100,"Capgemini","123456");
		Assert.assertTrue(entreprise.calculerImpot()==25);
		Assert.assertFalse(entreprise.calculerImpot()==40);

		AutoEntreprise entreprise2 = new AutoEntreprise(10000,"Gouiran","456789");
		Assert.assertTrue(entreprise2.calculerImpot()==entreprise2.chiffreAffaires*0.25);
	}

	@Test
	public void testImpotSas() {
		Sas sas = new Sas(100,"CGI","123456","12 rue Montmorency");
		Assert.assertTrue(sas.calculerImpot()==33);
		Assert.assertFalse(sas.calculerImpot()==40);

		Sas sas2 = new Sas(10000,"GFI","456789","45 rue des Lillas");
		Assert.assertTrue(sas2.calculerImpot()==sas2.chiffreAffaires*0.33);
	}



}
