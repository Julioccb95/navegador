package com.cursoBuscador.curso.controllers;

import com.cursoBuscador.curso.entities.WebPage;
import com.cursoBuscador.curso.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class SearchController {
    @Autowired
    private SearchService service;
    @CrossOrigin("*")
    @RequestMapping(value = "api/search", method = RequestMethod.GET)
    public List<WebPage> search(@RequestParam Map<String, String> params){
        String query=params.get("query");
        return service.search(query);
    }
}
