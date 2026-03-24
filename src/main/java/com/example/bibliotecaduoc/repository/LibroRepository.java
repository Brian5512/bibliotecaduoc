package com.example.bibliotecaduoc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bibliotecaduoc.model.Libro;

@Repository
public class LibroRepository {

    private List<Libro> listaLibros = new ArrayList<>();
    
    public List<Libro> obtenerLibros(){;
        return listaLibros;
        }

    public Libro buscarPorId(int id){
    for (Libro libro : listaLibros) {
        if (libro.getId() == id) {
            return libro;
        }
    }
    return null;
        }

    public Libro buscarPorIsbn(String isbn){
    for (Libro libro : listaLibros) {
        if (libro.getIsbn() == isbn) {
            return libro;
        }
    }
    return null;
        }
    public Libro Guardar(Libro libro){
        listaLibros.add(libro);
        return libro;
    }
    public Libro actualizar(Libro libro){
        Libro libroBuscado = buscarPorId(libro.getId());
        if(libroBuscado != null){
            libroBuscado.setIsbn(libro.getIsbn());
            libroBuscado.setAutor(libro.getAutor());
            libroBuscado.setEditorial(libro.getEditorial());
            libroBuscado.setFechaPublicacion(libro.getFechaPublicacion());
            libroBuscado.setTitulo(libro.getTitulo());
            return libroBuscado;
        }
        return null;
    }
    public void eliminar(int id){
        listaLibros.removeIf(libro -> libro.getId()== id);
    }
} 