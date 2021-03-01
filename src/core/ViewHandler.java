package core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.add.AddTasksController;
import view.remove.AllTasksController;

import java.io.IOException;

public class ViewHandler
{
  private Stage stage;
  private Scene allTasksViewScene;
  private Scene removeTaskViewScene;
  private Scene addTasksViewScene;

  private ViewModelFactory viewModelFactory;

  public ViewHandler(Stage stage, ViewModelFactory viewModelFactory)
  {
    this.viewModelFactory = viewModelFactory;
    this.stage = stage;
  }

  public void start()
  {
    openAllTasksView();
    stage.show();
  }

  public void openAllTasksView()
  {
    FXMLLoader loader = new FXMLLoader();
    if (allTasksViewScene == null)
    {
      Parent root = getRootByPath("../view/remove/AllTasksView.fxml", loader);
      AllTasksController controller = loader.getController();
      controller.init(viewModelFactory.getAllTasksViewModel(), this);
      allTasksViewScene = new Scene(root);
    }
    stage.setTitle("View Tasks");
    stage.setScene(allTasksViewScene);

  }

  public void openAddTaskView()
  {
    FXMLLoader loader = new FXMLLoader();
    if (addTasksViewScene == null)
    {
      Parent root = getRootByPath("../view/add/AddTasksView.fxml", loader);
      AddTasksController controller = loader.getController();
      controller.init(viewModelFactory.getAddTasksViewModel(), this);
      addTasksViewScene = new Scene(root);
    }
    stage.setTitle("Add Task");
    stage.setScene(addTasksViewScene);
  }

  public void openNextTaskView()
  {

  }

  private Parent getRootByPath(String path, FXMLLoader loader)
  {
    loader.setLocation(getClass().getResource(path));
    Parent root = null;
    try
    {
      root = loader.load();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    return root;
  }
}
