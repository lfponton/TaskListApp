package view.add;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.TaskModel;

public class AddTasksViewModel
{
  private StringProperty owner, description;
  private TaskModel taskModel;

  public AddTasksViewModel(TaskModel taskModel) {
    this.taskModel = taskModel;
    owner = new SimpleStringProperty();
    description = new SimpleStringProperty();
  }

  public void addNewTask() {
    taskModel.addTask(owner.getValue(), description.getValue());
  }

  public StringProperty ownerProperty() {
    return owner;
  }

  public StringProperty descriptionProperty() {
    return description;
  }

  public void clear() {
    owner.setValue("");
    description.setValue("");
  }
}
