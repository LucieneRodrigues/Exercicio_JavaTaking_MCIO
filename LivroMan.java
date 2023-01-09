package br.com.taking.man;

import java.util.ArrayList;

import br.com.taking.dominio.Livro;


public class LivroMan {

	public static void main(String[] args) {
		
		ArrayList<br.com.taking.dominio.Livro> objetolivro = new ArrayList<>();
		objetolivro.add(new Livro(325,"Capa dura","O Livre arbitrio",25.0));
		objetolivro.add(new Livro(236,"Broxura","O cacador de palavras",25.0));
		objetolivro.add(new Livro(0123,"Espiral","O instinto",25.0));
		objetolivro.add(new Livro(302,"Capa dura","Poder de decisao",25.0));
		objetolivro.add(new Livro(126,"Capa dura","A menininha",25.0));
		objetolivro.add(new Livro(326,"Espiral","Pequena crianca",25.0));
		objetolivro.add(new Livro(328,"Capa dura","Etc e tal",25.0));
		objetolivro.add(new Livro(315,"Broxura","O Livre arbitrioI",25.0));
		objetolivro.add(new Livro(325,"Capa dura","O Livre arbitrioII",25.0));
		objetolivro.add(new Livro(358,"Capa dura","O Livre arbitrioIII",25.0));
		 for(int i = 0; i< objetolivro.size(); i++) {
			 System.out.println(objetolivro.get(i).getIsbn());	
			 System.out.println(objetolivro.get(i).getTipo());	
			 System.out.println(objetolivro.get(i).getTitulo());	
			 System.out.println(objetolivro.get(i).getPreco());	
			 System.out.println("-----------------------------------");
			 
		 }		

	}

}
