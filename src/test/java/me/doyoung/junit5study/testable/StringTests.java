package me.doyoung.junit5study.testable;

class StringTests implements ComparableContract<String>, EqualsContract<String> {
    @Override
    public String createSmallerValue() {
        return "apple"; // 'a' < 'b' in "banana"
    }

    @Override
    public String createNotEqualValue() {
        return "cherry";
    }

    @Override
    public String createValue() {
        return "banana";
    }
}
