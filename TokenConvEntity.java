package com.backoffice.tribebackofficeservice.tokenConv;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity(name = "token_conversion")

public class TokenConvEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long token_id;
     private String category;
     private String details;
     private double discovery;
     private double collector;
     private double updatePOI;
     private String status; 



    
}
