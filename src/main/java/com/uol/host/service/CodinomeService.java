package com.uol.host.service;

import com.uol.host.model.GrupoCodinome;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodinomeService {

    public String gerarCodinome(GrupoCodinome grupoCodinome, List<String> codinomesEmUso) {
        var codinomesDisponiveis = ListarCodinomesDisponiveis(grupoCodinome, codinomesEmUso);
        if(codinomesDisponiveis.isEmpty()) { 
            throw new Exception("Não há codinomes disponiveis para o grupo " + grupoCodinome.getNome());
        }
    }
}
