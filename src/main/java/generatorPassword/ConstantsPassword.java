package generatorPassword;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ConstantsPassword {
    public static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    public static final String DIGITS = "0123456789";
    public static final String SPECIAL_CHARACTERS = "!<>?@#^&*()$%-_=+";
    public static final String ALL_CHARACTERS = UPPER_CASE + LOWER_CASE + DIGITS + SPECIAL_CHARACTERS;
}
