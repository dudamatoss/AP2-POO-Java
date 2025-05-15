package com.POO.AP2.repositories;

import com.POO.AP2.model.Carro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarroRepository {
    List<Carro> carros = new ArrayList<>();

    public List<Carro> ListarTodosCarros() {
        return carros;
    }
    public Carro ListarPorId(int id) {
        return CarroSelecionado(id);
    }
    public Carro CriarCarro(Carro carroRequest) {
        this.carros.add(carroRequest);
        return carroRequest;
    }

    public Carro EditarCarro(Carro carroRequest,  int id) {
        Carro carroExistente = CarroSelecionado(id);

        carroRequest.setId(carroExistente.getId());
        int index = carros.indexOf(carroExistente);

        carros.set(index, carroRequest);
        return carroRequest;
    }

    public void DeleteCarro(int id) {
        Carro carroExistente = CarroSelecionado(id);

        carros.remove(carroExistente);
    }
    private Carro CarroSelecionado (int id){
        return carros.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElseThrow();
    }
}
