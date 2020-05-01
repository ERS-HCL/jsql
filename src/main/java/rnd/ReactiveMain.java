package rnd;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;

public class ReactiveMain {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        @NonNull String result = "";
        /*
        Observable.fromArray(letters)
        .map(String::toUpperCase)
        .subscribe(letter -> result += letter);
        */
    }
}
