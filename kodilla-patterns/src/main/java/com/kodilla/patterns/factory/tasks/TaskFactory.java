package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("name1", "city1", "car");
            case SHOPPING:
                return new ShoppingTask("name2", "apple", 30);
            case PAINTING:
                return new PaintingTask("name3", "red", "portrait");
        }

        return null;
    }
}
