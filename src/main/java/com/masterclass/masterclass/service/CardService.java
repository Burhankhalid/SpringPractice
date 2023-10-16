package com.masterclass.masterclass.service;

import com.masterclass.masterclass.entity.CardHolder;

import java.util.List;

public interface CardService {

    CardHolder saveCardHolder(CardHolder holder);

    List<CardHolder> fetchCardHolderList();

    CardHolder fetchCardHolderByID(Long id);

    void deleteCardHolderByID(Long id);
}
