package com.backoffice.tribebackofficeservice.tokenConv;
import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.backoffice.tribebackofficeservice.tokenConv.TokenConvEntity;
//import com.backoffice.tribebackofficeservice.tokenConv.TokenConvService;

//import com.example.internalservice.UserConfig.Collection.CollectionEntity;
//import com.example.internalservice.UserConfig.User.UserEntity;
//import com.example.internalservice.commonservices.JwtTokenUtil;

//import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("tokens")



public class TokenConvController {

    private TokenConvService tokenService;
	
	 @PostMapping
	    public ResponseEntity<TokenConvEntity> createToken(@RequestBody  TokenConvEntity tokenconventity) {
            TokenConvEntity createtoken = tokenService.createToken(tokenconventity);
	        return new ResponseEntity<TokenConvEntity>(createtoken, HttpStatus.CREATED);
	    }

	    @GetMapping("{id}")
	    public ResponseEntity<TokenConvEntity> getTokenById(@PathVariable Long id) {
	    	TokenConvEntity tokenconventity = tokenService.getTokenById(id);
	        return new ResponseEntity<TokenConvEntity>(tokenconventity, HttpStatus.OK);
	    }

	    @GetMapping
	    public ResponseEntity<List<TokenConvEntity>> getAllTokens() {
	        List<TokenConvEntity> tokenconventity = tokenService.getAllTokens();
	        return new ResponseEntity<List<TokenConvEntity>>(tokenconventity, HttpStatus.OK);
	    }

	    @PutMapping("{id}")
	    public ResponseEntity<TokenConvEntity> updateToken(@PathVariable Long id,
	            @RequestBody TokenConvEntity tokenconventity) {
                    TokenConvEntity updatedToken = tokenService.updateToken(id, tokenconventity);
	        return new ResponseEntity<TokenConvEntity>(updatedToken, HttpStatus.OK);
	    }


	    @DeleteMapping("{id}")
	    public ResponseEntity<String> deleteToken(@PathVariable Long id) {
	    	tokenService.deleteToken(id);
	        return new ResponseEntity<String>("Deleted Token Successfully..!!", HttpStatus.OK);
	    }




    
}
