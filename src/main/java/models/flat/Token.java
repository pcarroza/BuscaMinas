package main.java.models.flat;

import java.util.Objects;

class Token {

    private String token;

    Token(String token) {
        this.token = token;
    }

    Token() {
    }

    void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return this.token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Token token1 = (Token) o;
        return token.equals(token1.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token);
    }

    public static void main(String[] args) {
        System.out.println("   " + new Token("_"));
    }
}


