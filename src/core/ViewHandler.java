package core;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewHandler
{
  private Stage stage;
  private Scene allTasksViewScene;
  private Scene removeTaskViewScene;
  private Scene getAllTasksViewScene;

  private ViewModelFactory viewModelFactory;

  public ViewHandler(Stage stage, ViewModelFactory viewModelFactory) {
    this.viewModelFactory = viewModelFactory;
    this.stage = stage;
  }

  public void start() {

  }

  public void openAllTasksView() {

  }

  public void openAddTaskView() {

  }

  public void openNextTaskView() {

  }

  private Parent getRootByPath(String path) {
    return null;
  }
}
