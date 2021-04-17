package main.java.views.menu;

import main.java.utils.Console;
import main.java.utils.LimitIntDialog;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final List<Command> commands;

    public Menu() {
        commands = new ArrayList<>();
    }

    public void setCommand(Command command) {
        this.commands.add(command);
    }

    public void execute() {
        List<Command> commands = new ArrayList<>();
        for (Command command : this.commands) {
            if (command.isActive()) {
                commands.add(command);
            }
        }
        writeMenu(commands);
        int option = LimitIntDialog.getInstance().read("Ingrese Opción: ", commands.size()) - 1;
        commands.get(option).execute();
    }

    private static void writeMenu(List<Command> commands) {
        assert commands != null;
        Console.getInstance().writeln();
        for (int i = 0; i < commands.size(); i++) {
            Console.getInstance().writeln("[" + (i + 1) + "]" + commands.get(i).getTitle());
        }
        Console.getInstance().writeln();
    }
}
