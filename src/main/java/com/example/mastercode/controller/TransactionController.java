package com.example.mastercode.controller;

import com.example.mastercode.entities.Transaction;
import com.example.mastercode.services.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("transaction")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }
    @GetMapping()
    public List<Transaction> getTransactionList() throws Exception {
        return transactionService.findAll();
    }

    @PostMapping()
    public Transaction createTransaction(@RequestBody Transaction request) throws Exception {
        return transactionService.create(request);
    }

    @GetMapping("/{id}")
    public Optional<Transaction> getTransactionId(@PathVariable Long id) throws Exception {
        return Optional.ofNullable(transactionService.findById(id));
    }

    @PatchMapping("/{id}")
    public Transaction modifyTransaction(@PathVariable Long id, @RequestBody Transaction transaction) throws Exception {
        return transactionService.update(id, transaction);
    }

    @DeleteMapping("/{id}")
    public boolean deleteTransaction(@PathVariable Long id) throws Exception {
        return transactionService.delete(id);
    }
}
