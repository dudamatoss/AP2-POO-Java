package com.POO.AP2.repositories;

import com.POO.AP2.model.Carro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarroRepository {
    List<Carro> carros = new ArrayList<>();

    public List<Carro> listarTodosCarros() {
        return carros;
    }

    public Carro listarPorId(int id) {
        return carroSelecionado(id);
    }

    public Carro criarCarro(Carro carroRequest) {
        this.carros.add(carroRequest);
        return carroRequest;
    }

    public Carro editarCarro(Carro carroRequest,  int id) {
        Carro carroExistente = carroSelecionado(id);

        carroRequest.setId(carroExistente.getId());
        int index = carros.indexOf(carroExistente);

        carros.set(index, carroRequest);
        return carroRequest;
    }

    public void deleteCarro(int id) {
        Carro carroExistente = carroSelecionado(id);

        carros.remove(carroExistente);
    }
    private Carro carroSelecionado (int id){
        return carros.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElseThrow();
    }
}
