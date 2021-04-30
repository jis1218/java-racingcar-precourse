package kr.insup.domain;

public class Name {

    private String name;

    public Name(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name){
        if(name == null || name.length()>5 || name.isEmpty()){
            throw new IllegalArgumentException();
        }
    }
}
