package com.heitor.pdfgenerator.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.heitor.pdfgenerator.model.Estudante;

@Service
public class EstudanteService {

	public List<Estudante> getEstudantes() {

		final List<Estudante> students = new ArrayList<>();
		students.add(new Estudante(1, "Heitor Fernando", "Barbosa Ramos", LocalDate.parse("1988-07-06"), "Brasil", "Anhaguera", true));
		students.add(new Estudante(2, "Antonio", "Barbosa", LocalDate.parse("1988-07-06"), "Brasil", "FMU", true));
		students.add(new Estudante(3, "Marta", "Barbosa", LocalDate.parse("1988-07-06"), "Brasil", "USP", true));
		students.add(new Estudante(4, "Carla", "Peres", LocalDate.parse("1988-07-06"), "Brasil", "USP", true));
		students.add(new Estudante(5, "Glória", "Maria", LocalDate.parse("1988-07-06"), "Brasil", "Anhaguera", true));
		students.add(new Estudante(6, "Ellen", "Rocche", LocalDate.parse("1988-07-06"), "Brasil", "Anhaguera", true));
		students.add(new Estudante(7, "Carlos", "Alberto de Nobrega", LocalDate.parse("1988-07-06"), "Brasil", "IASP", true));
		students.add(new Estudante(8, "Silvio Santos", "Barbosa", LocalDate.parse("1988-07-06"), "Brasil", "Cruzeiro do Sul", true));
		students.add(new Estudante(9, "Adriana", "Galisteu", LocalDate.parse("1988-07-06"), "Brasil", "São Judas", true));
		students.add(new Estudante(10, "Silvio", "Santos", LocalDate.parse("1988-07-06"), "Brasil", "FMU", true));
		students.add(new Estudante(11, "Lucia", "Barbosa Ramos", LocalDate.parse("1988-07-06"), "Brasil", "Anhaguera", true));
		students.add(new Estudante(12, "Pedro", "Bial", LocalDate.parse("1988-07-06"), "Brasil", "FMU", true));
		students.add(new Estudante(13, "Sônia", "Braga", LocalDate.parse("1988-07-06"), "Brasil", "USP", true));
		students.add(new Estudante(14, "Abguimar", "Oliveira Silva", LocalDate.parse("1988-07-06"), "Brasil", "USP", true));
		students.add(new Estudante(15, "Tadeu", "Dores", LocalDate.parse("1988-07-06"), "Brasil", "Anhaguera", true));
		students.add(new Estudante(16, "Jhonatan", "Nemmer", LocalDate.parse("1988-07-06"), "Brasil", "Anhaguera", true));
		students.add(new Estudante(17, "Luiz", "de Nobrega", LocalDate.parse("1988-07-06"), "Brasil", "IASP", true));
		students.add(new Estudante(18, "Elhen", "Da Silva Ramos", LocalDate.parse("1988-07-06"), "Brasil", "Cruzeiro do Sul", true));
		students.add(new Estudante(19, "Silvia", "Galisteu", LocalDate.parse("1988-07-06"), "Brasil", "São Judas", true));
		students.add(new Estudante(20, "Zurique", "Santos", LocalDate.parse("1988-07-06"), "Brasil", "FMU", true));
		students.add(new Estudante(21, "Lazaro", "Santos", LocalDate.parse("1988-07-06"), "Brasil", "FMU", true));
		students.add(new Estudante(22, "Shimite", "Barbosa Zeu", LocalDate.parse("1988-07-06"), "Brasil", "Anhaguera", true));
		students.add(new Estudante(23, "Carlos", "Felipe cardoso", LocalDate.parse("1988-07-06"), "Brasil", "FMU", true));
		students.add(new Estudante(24, "Marta", "Barbosa", LocalDate.parse("1988-07-06"), "Brasil", "USP", true));
		students.add(new Estudante(25, "Carla", "Peres", LocalDate.parse("1988-07-06"), "Brasil", "USP", true));
		students.add(new Estudante(26, "Glória", "Maria", LocalDate.parse("1988-07-06"), "Brasil", "Anhaguera", true));
		students.add(new Estudante(27, "Ellen", "Rocche", LocalDate.parse("1988-07-06"), "Brasil", "Anhaguera", true));
		students.add(new Estudante(28, "Carlos", "Alberto de Nobrega", LocalDate.parse("1988-07-06"), "Brasil", "IASP", true));
		students.add(new Estudante(29, "Silvio Santos", "Barbosa", LocalDate.parse("1988-07-06"), "Brasil", "Cruzeiro do Sul", true));
		return students;

	}
}
