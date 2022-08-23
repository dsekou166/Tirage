package com.example.Tirage.controller;


import com.example.Tirage.model.PostulantTrie;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/file")
public class FileController {
    private FileController fileController;

    public FileController(FileController fileController) {
        this.fileController = fileController;
    }

    @PostMapping()
    public List<PostulantTrie> chargerFichier(@RequestParam("file") MultipartFile file, @RequestParam("nb_postulant") int nb_postulant) throws IllegalStateException{
        return this.fileController.chargerFichier(file, nb_postulant);
    }
}
