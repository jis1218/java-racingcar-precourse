package kr.insup.domain;

public class Name {

    private String name;
    private final static int MAX_LENGTH = 5;

    public Name(String name) {
        validateName(name);
        this.name = name;
    }

    /**
     * 입력된 차 이름을 검증하는 메서드
     * 입력값이 null이거나 빈 문자열이거나 {MAX_LENGTH}보다 크면 IllegalArgumentException 던짐
     *
     * @param name 입력된 차 이름
     */
    private void validateName(String name) {
        if (name == null || name.length() > MAX_LENGTH || name.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }
}
