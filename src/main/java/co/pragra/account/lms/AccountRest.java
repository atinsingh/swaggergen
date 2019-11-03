package co.pragra.account.lms;

import co.pragra.account.lms.model.Account;
import co.pragra.account.lms.rest.AccountApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountRest implements AccountApi {
    @Override
    //@RequestMapping(produces = "application/json", consumes = "application/json")
    public ResponseEntity<Account> addAccount(Account body) {
        return ResponseEntity.status(200).body(body) ;
    }
}
