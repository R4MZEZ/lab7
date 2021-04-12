package Commands;

import com.CollectionManager;

import java.util.Scanner;

public class CommandSave implements Command{

    CollectionManager manager;

    public CommandSave(CollectionManager manager) {
        this.manager = manager;
    }

    public CommandSave() {
    }

    public void setManager(CollectionManager manager) {
        this.manager = manager;
    }

    @Override
    public void execute() {
        manager.save(manager);

    }

    @Override
    public boolean validate(String argument, Scanner reader) {
        return true;
    }
}

