package main.java.views;

import main.java.controllers.*;

public interface View extends ControllersVisitor {

    void interact(OperationController operationController);
}
