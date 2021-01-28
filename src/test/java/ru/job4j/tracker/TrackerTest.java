package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

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

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item();
        bugWithDesc.setName("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenNotReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item();
        bugWithDesc.setName("Bug with description");
        tracker.replace(5, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}