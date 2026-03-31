
package com.example.bibliotecaduoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.repository.LibroRepository;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> readAll(){
        return libroRepository.obtenerLibros();
    }
    public Libro guardar(Libro libro){
        return libroRepository.Guardar(libro);
    }
    public Libro update(Libro libro){
        return libroRepository.actualizar(libro);
    }

    public Libro readByid(int id){
        return libroRepository.buscarPorId(id);
    }
    public Libro readByisbn(String isbn){
        return libroRepository.buscarPorIsbn(isbn);
    }
    public void datosFake(){
        libroRepository.cargarLibrosFake();
    }
    public  Libro updateid(int id, Libro libro) {
        return libroRepository.modificarid(id, libro);
    }
    public boolean deleteLibro (int id){
        return libroRepository.
    }
}
