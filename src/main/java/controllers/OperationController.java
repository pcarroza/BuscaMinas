package main.java.controllers;

public interface OperationController extends Controller {

    void accept(ControllersVisitor controllersVisitor);
}
