package behavioral.command;

public class Developer {
    private Command insert;
    private Command update;
    private Command select;
    private Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertData() {
        insert.execute();
    }

    public void updateData() {
        update.execute();
    }

    public void selectData() {
        select.execute();
    }

    public void deleteData() {
        delete.execute();
    }
}
