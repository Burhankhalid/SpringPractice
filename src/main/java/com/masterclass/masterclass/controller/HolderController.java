package com.masterclass.masterclass.controller;

import com.masterclass.masterclass.entity.CardHolder;
import com.masterclass.masterclass.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HolderController {

    @Autowired
    private CardService cardService;

    @PostMapping("/cardholders")
    public CardHolder saveCardHolder(@RequestBody CardHolder holder) {
        return cardService.saveCardHolder(holder);
    }

    @GetMapping("/cardholders")
    public List<CardHolder> fetchCardHolderList() {
        return cardService.fetchCardHolderList();

    }

    @GetMapping("/cardholders/{id}")
    public CardHolder fetchCardHolderByID(@PathVariable("id") Long ID){
        return cardService.fetchCardHolderByID(ID);
    }

    @DeleteMapping("/cardholders/{id}")
    public String deleteCardHolderByID(@PathVariable("id") Long ID){
        cardService.deleteCardHolderByID(ID);
        return "Card Holder deleted successfully!";
    }
}
