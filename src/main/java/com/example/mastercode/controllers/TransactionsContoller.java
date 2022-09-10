package com.example.mastercode.controllers;

import org.springframework.web.bind.annotation.PatchMapping;

import com.example.mastercode.entities.Transactions;
import com.example.mastercode.services.TransactionService;
import org.springframework.web.bind.annotation.*;

public class TransactionsContoller {
    TransactionService Transactions;

    public TransactionsContoller() {
        this.Transactions = new TransactionService();
        
    }
    
        @GetMapping("/transactions")
        public final Transactions getTransaction(){
            return null;
        }

        @PostMapping("/transactions")
        public Transactions postTransaction(){
            return null;
        }

        @PutMapping("/transactions")
        public Transactions putTransaction(){
            return null;
        }

        @DeleteMapping("/transactions")
        public Transactions deleteTransaction(){
            return null;
        }

        @PatchMapping("/transactions")
        public Transactions patchTransaction(){
            return null;
        }


    
}
