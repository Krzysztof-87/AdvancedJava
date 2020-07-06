package KlasyIInterfejsy.Zad1;

/*
Zaimplementuj klasę UserValidator , która w ramach metody validateEmails
będzie odpowiedzialna za walidację danych użytkownika: email, email
alternatywny. W ramach metody validateEmails zadeklaruj klasę lokalną
Email , która będzie odpowiedzialna za formatowanie wskazanego adresu email
uwzględniając następujące reguły:
jeśli wskazany adres email jest pusty, bądź jest nullem należy ustawić mu
wartość unknown
jeśli wskazany adres email nie spełnia założeń adresu email, należy ustawić
wartość unknown (skorzystaj w tym celu z wyrażeń regularnych)
 */


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    private boolean isValidateCorrectly;

    public String validateEmails(String emailAddress) {
        final String EMAIL_PATTERN = "([0-9a-zA-Z]([-.\\w]*[0-9a-zA-Z_+])*@((([a-zA-Z0-9])|([a-zA-Z0-9][[a-zA-Z0-9]-]{0,61}[a-zA-Z0-9]))\\.)+[a-zA-Z]{2,63}){0,254}";
        final String WRONG_VALIDATION="unknown";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(emailAddress);
        class Email {
            public void emailValidator() {
                if (emailAddress.equals("") || matcher.matches()) {
                     isValidateCorrectly=false;
                }else
                    isValidateCorrectly=true;


            }

        }
        if(isValidateCorrectly){
            return emailAddress;
        }else
            return WRONG_VALIDATION;
    }
}
