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

    public List<Carro> ListarTodosCarros(){
        return this.carroRepository.ListarTodosCarros();
    }

    public Carro ListarPorId (int id) {
        return this.carroRepository.ListarPorId(id);
    }

    public Carro CriarCarro (Carro carroRequest){
        return this.carroRepository.CriarCarro(carroRequest);
    }

    public Carro EditarCarro (Carro carroRequest, int id){
        return this.carroRepository.EditarCarro(carroRequest, id);
    }

    public void DeleteCarro (int id){
        this.carroRepository.DeleteCarro(id);
    }
}
