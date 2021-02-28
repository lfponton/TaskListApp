package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskModelManager implements TaskModel
{
  private List<Task> tasks;
  private PropertyChangeSupport support;

  public TaskModelManager()
  {
    tasks = new ArrayList<>();
    support = new PropertyChangeSupport(this);
  }

  @Override public void addTask(String owner, String description)
  {
    SimpleDateFormat simpleDateFormatDate = new SimpleDateFormat(
        "yyyy/MM/dd HH:mm:ss");
    Date now = new Date();
    String timeCreated = simpleDateFormatDate.format(now);
    Task task = new Task(owner, description, timeCreated);
    tasks.add(task);
  }

  @Override public Task getNextTask()
  {
    return null;
  }

  @Override public void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(listener);
  }

  @Override public void addPropertyChangeListener(String eventName,
      PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(eventName, listener);
  }

  @Override public void removePropertyChangeListener(
      PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(listener);
  }

  @Override public void removePropertyChangeListener(String eventName,
      PropertyChangeListener listener)
  {
    removePropertyChangeListener(eventName, listener);
  }
}
