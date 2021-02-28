package view.remove;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Task;
import model.TaskModel;

import java.beans.PropertyChangeEvent;

public class AllTasksViewModel
{
  private ObservableList<Task> tasks;
  private TaskModel taskModel;

  public AllTasksViewModel(TaskModel taskModel)
  {
    this.taskModel = taskModel;
    this.tasks = FXCollections.observableArrayList();

    // Adding listeners. The first using a private method
    taskModel.addPropertyChangeListener("TaskAdded", this::listModified);
    // Second using a lambda expression
    taskModel.addPropertyChangeListener("TaskRemoved",
        evt -> tasks.remove((Task) evt.getNewValue()));
  }

  private void listModified(PropertyChangeEvent evt)
  {
    tasks.add((Task) evt.getNewValue());
  }

  public ObservableList<Task> getTasks()
  {
    return tasks;
  }
}
