package main.java.models;

public enum Box {

    EMPTY(new Token("_")),
    FLAG(new Token("P")),
    MINE(new Token("*")),
    NUMBER_OF_MINES_AROUND_THE_BOX(new Token());

    private final Token token;

    Box(Token token) {
        this.token = token;
    }

    public void setNumberOfMines(String numberOfMines) {
        this.token.setToken(numberOfMines);
    }

    public boolean isEquals(Box box) {
        return this.token.equals(box.token);
    }

    @Override
    public String toString() {
        return this.token.toString();
    }
}
