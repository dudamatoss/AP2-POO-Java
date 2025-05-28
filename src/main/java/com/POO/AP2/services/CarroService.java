package com.POO.AP2.services;

import com.POO.AP2.model.Carro;
import com.POO.AP2.repositories.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {
    private CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public List<Carro> listarTodosCarros(){
        return this.carroRepository.listarTodosCarros();
    }

    public Carro listarPorId (int id) {
        return this.carroRepository.listarPorId(id);
    }

    public Carro criarCarro (Carro carroRequest){
        return this.carroRepository.criarCarro(carroRequest);
    }

    public Carro editarCarro (Carro carroRequest, int id){
        return this.carroRepository.editarCarro(carroRequest, id);
    }

    public void deleteCarro (int id){
        this.carroRepository.deleteCarro(id);
    }
}
