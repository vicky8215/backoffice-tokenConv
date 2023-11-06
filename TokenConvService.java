package com.backoffice.tribebackofficeservice.tokenConv;


import java.util.List;

//import com.backoffice.tribebackofficeservice.tokenConv.TokenConvEntity;

public interface TokenConvService {

    TokenConvEntity createToken(TokenConvEntity tokenconventity);

	TokenConvEntity getTokenById(Long id);

    List<TokenConvEntity> getAllTokens();

    TokenConvEntity updateToken(Long id, TokenConvEntity tokenconventity);

    void deleteToken(Long id);

    
}
