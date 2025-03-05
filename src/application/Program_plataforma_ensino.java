package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program_plataforma_ensino {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Lesson> list = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int qntAulasCurso = sc.nextInt();
		int durationCourse = 0; 
		
		System.out.println();
		
		for(int i = 1; i <= qntAulasCurso; i++) {
			System.out.println("Dados da " + i + "º aula: ");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char type = sc.next().charAt(0);
			
			if(type == 'c') {
				System.out.print("Título: ");
				String title = sc.next();
				System.out.print("URL do vídeo: ");
				String urlVideo = sc.nextLine();
				sc.nextLine();
				System.out.print("Duração em segundos: ");
				int duration = sc.nextInt();
				list.add(new Video(title, urlVideo, duration));
				System.out.println();
			} else {
				System.out.print("Título: ");
				String title = sc.next();
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int quantityQuestions = sc.nextInt();
				list.add(new Task(title, description, quantityQuestions));
				System.out.println();
				
			}
		}
		
		for(Lesson lesson : list) {
			durationCourse += lesson.duration();
		}
		
		System.out.print("Duracão total do curso = " + durationCourse + " segundos");
	}
}
