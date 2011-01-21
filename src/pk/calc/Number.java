package pk.calc;

class Number extends Token {

    public Number(String value) {
        super("number", Double.parseDouble(value));
    }

    public Number(Double value) {
        super("number", value);
    }

    @Override
    public Double getValue() {
        return (Double) value;
    }

    static TokenMatcher getMatcher() {
        return new TokenMatcher("Number", "[\\d.]+");
    }
}
