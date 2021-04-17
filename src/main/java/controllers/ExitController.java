package main.java.controllers;

public interface ExitController extends Controller {

    boolean isFlagInBoard();

    boolean isOpenAnyBox();

    void exit();
}
