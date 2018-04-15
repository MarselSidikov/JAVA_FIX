package ru.ivmiit.classes;

/**
 * 11.04.2018
 * Table
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Table {
    public int size;
    public String color;

    public Table(int size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Table{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
