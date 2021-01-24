package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void findAllItems() {
        Tracker tracker = new Tracker();
        tracker.add(new Item());
        tracker.add(new Item());
        tracker.add(new Item());
        Item[] items = tracker.findAll();
        assertThat(3, is(items.length));
        assertThat(1, is(items[0].getId()));
        assertThat(2, is(items[1].getId()));
        assertThat(3, is(items[2].getId()));
    }

    @Test
    public void findEqName() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("task1"));
        tracker.add(new Item("task2"));
        tracker.add(new Item("task2"));
        tracker.add(new Item("task3"));
        Item[] items = tracker.findByName("task2");
        assertThat(2, is(items.length));
        assertThat("task2", is(items[0].getName()));
        assertThat("task2", is(items[1].getName()));
    }
}