
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
    public void delete(int id ){
        libroRepository.eliminar(id);
    }
    public Libro readByid(int id){
        return libroRepository.buscarPorId(id);
    }
    public Libro readByisbn(String isbn){
        return libroRepository.buscarPorIsbn(isbn);
    }
}
