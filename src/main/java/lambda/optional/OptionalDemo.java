package lambda.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Hello");

        if (optionalString.isPresent()) {
            System.out.println("Value is present: " + optionalString.get());
        } else {
            System.out.println("Value is absent");
        }

        String value = optionalString.orElse("Default Value");
        System.out.println(value);

        optionalString.ifPresent(str -> System.out.println("Value is present: " + str));

        Optional<String> transformedOptional = optionalString.map(String::toUpperCase);
        transformedOptional.ifPresent(str -> System.out.println("Transformed value: " + str));

        Optional<String> emptyOptional = Optional.empty();
        String emptyValue = emptyOptional.orElseThrow(IllegalStateException::new);
        System.out.println(emptyValue);
    }
}
