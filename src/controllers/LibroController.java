package controllers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.Set;
import java.util.TreeMap;

import models.Book;

public class LibroController {

     public Map<Book, Book> procesarLibros(List<Book> libros){
        Map<Book, Book> librosOrdenado = new TreeMap<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                int compTitulo = b2.getTitulo().compareToIgnoreCase(b1.getTitulo()); 
                if (compTitulo != 0) return compTitulo;

                int compAnio = Integer.compare(b1.getAnio(), b2.getAnio()); 
                return compAnio;
            }
        });

         for (Book libro : libros) {
            librosOrdenado.put(libro, libro); 
        }

        return librosOrdenado;
    

     }

    
}
