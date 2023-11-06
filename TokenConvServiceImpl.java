package com.backoffice.tribebackofficeservice.tokenConv;
import java.util.List;

import org.springframework.stereotype.Service;

//import com.backoffice.tribebackofficeservice.tokenConv.TokenConvEntity;

//import com.backoffice.tribebackofficeservice.tokenConv.TokenConvRepository;
//import com.backoffice.tribebackofficeservice.tokenConv.TokenConvService;

//import com.example.internalservice.UserConfig.Collection.CollectionRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TokenConvServiceImpl implements TokenConvService {

	private TokenConvRepository tokenconvRepo;
	
	@Override
	public TokenConvEntity createToken(TokenConvEntity tokenconventity)
	{
		 return tokenconvRepo.save(tokenconventity);
	}

	@Override
	public TokenConvEntity getTokenById(Long id) {
		TokenConvEntity tokenconventity = tokenconvRepo.findById(id).get();
		  return tokenconventity;
		  
	}

	@Override
    public List<TokenConvEntity> getAllTokens(){
    	return tokenconvRepo.findAll();
    }

    public TokenConvEntity updateToken(Long id, TokenConvEntity tokenconventity) {
    	TokenConvEntity existingTokenConvEntity = tokenconvRepo.findById(id).get();
    	if(existingTokenConvEntity!=null)
    	{
    		
    		existingTokenConvEntity.setCollector(tokenconventity.getCollector());
    		existingTokenConvEntity.setDetails(tokenconventity.getDetails());
    		existingTokenConvEntity.setDiscovery(tokenconventity.getDiscovery());
    		existingTokenConvEntity.setStatus(tokenconventity.getStatus());
    		existingTokenConvEntity.setUpdatePOI(tokenconventity.getUpdatePOI());
    		TokenConvEntity updatedTokenConvEntity = tokenconvRepo.save(existingTokenConvEntity);
    		return updatedTokenConvEntity;
    		
    	}
    	else
    	{
    		return null;
    	}
    }
    

    public void deleteToken(Long id) {
    	tokenconvRepo.deleteById(id);
    }
    
}







