package kr.insup.domain;

public class Name {

    private String name;
    private final static int MAX_LENGTH = 5;

    public Name(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name == null || name.length() > MAX_LENGTH || name.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }
}
