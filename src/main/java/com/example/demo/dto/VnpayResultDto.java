package com.example.demo.dto;

import com.example.demo.entity.Vnpay;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VnpayResultDto extends Vnpay {
    private String vnp_BankTranNo;
    private String vnp_CardType;
    private String vnp_PayDate;
    private String vnp_TransactionNo;
    private String vnp_ResponseCode;
    private String vnp_TransactionStatus;
    private String vnp_SecureHashType;
}
