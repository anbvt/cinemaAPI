package com.example.demo.controller.rest;

import com.example.demo.dto.BillDto;
import com.example.demo.exception.InvalidRequestParameterException;
import com.example.demo.model.RateAndReviewBillModel;
import com.example.demo.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/bill")
@CrossOrigin("*")
public class BillController {
    @Autowired
    private BillService billService;

    @GetMapping(value = {"", "/"})
    public ResponseEntity<?> getBillHistory(@RequestParam Optional<Integer> customerId) throws InvalidRequestParameterException {
        return ResponseEntity.ok(billService.getBillHistory(customerId));
    }

    @GetMapping("/details/{id}")
    public ResponseEntity<?> getBillDetails(@PathVariable("id") Optional<Integer> billId, @RequestParam Optional<Integer> customerId) throws InvalidRequestParameterException {
        return ResponseEntity.ok(billService.getBillDetails(billId, customerId));
    }

    @PostMapping("/save")
    public ResponseEntity<?> insertBill(@RequestBody Optional<BillDto> billDto) throws InvalidRequestParameterException {
        return ResponseEntity.ok(billService.insertBill(billDto));
    }

    @PostMapping("/updateRateAndReview")
    public ResponseEntity<?> updateRateAndReview(@RequestBody RateAndReviewBillModel model){
        return ResponseEntity.ok(billService.updateRateAndReview(model));
    }

    @GetMapping("/getByMovie")
    public ResponseEntity<?> getByMovie(@RequestParam("id") String id){
        return ResponseEntity.ok(billService.findByMovie(id));
    }
}
