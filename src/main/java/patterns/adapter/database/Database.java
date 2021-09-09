package patterns.adapter.database;

public interface Database {
    void insert();
    void update();
    void select();
    void remove();
}
