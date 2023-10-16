package com.masterclass.masterclass.service;

import com.masterclass.masterclass.entity.CardHolder;
import com.masterclass.masterclass.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImp implements CardService {

    @Autowired
    private CardRepository cardRepository;
    @Override
    public CardHolder saveCardHolder(CardHolder holder) {
        return cardRepository.save(holder);
    }

    @Override
    public List<CardHolder> fetchCardHolderList() {
        return cardRepository.findAll();
    }

    @Override
    public CardHolder fetchCardHolderByID(Long id) {
        return cardRepository.findById(id).get();
    }

    @Override
    public void deleteCardHolderByID(Long id) {
        cardRepository.deleteById(id);
    }
}
