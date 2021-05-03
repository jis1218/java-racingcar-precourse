package kr.insup.domain;

public class Trial {

    private Integer trial;
    private static final int MIN_DIGIT = 0;
    private static final int MAX_DIGIT = 1;

    public Trial(String trialInput) {
        validateTrial(trialInput);
        this.trial = Integer.valueOf(trialInput);
    }

    /**
     * 입력 횟수의 자리수
     * 최소 1자리부터 1 + {MAX_DIGIT}까지 입력 가능
     *
     * @param trialInput 입력된 문자열 값
     */
    private void validateTrial(String trialInput) {
        String regex = "^[1-9][0-9]{" + MIN_DIGIT + "," + MAX_DIGIT + "}";
        if (!trialInput.matches(regex)) {
            throw new IllegalArgumentException();
        }
    }

    public Integer getTrial() {
        return trial;
    }
}
