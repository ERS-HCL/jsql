package rnd;

import java.util.Optional;

import lombok.Getter;
import lombok.Setter;

public class OptionalMain {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.getProfile().flatMap(Profile::getCard).map(Card::getNum);

    }
    
    @Getter
    @Setter
    static class Customer {
        Profile profile;
        
        Optional<Profile> getProfile() {
            return Optional.ofNullable(profile);
        }
    }
    
    @Getter
    @Setter
    static class Profile {
        Card card;
        Optional<Card> getCard() {
            return Optional.ofNullable(card);
        }
    }
    
    @Getter
    @Setter
    class Card {
        int num;
        int getNum() {
            return num;
        }
    }

}
