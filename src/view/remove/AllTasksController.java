package view.remove;

import core.ViewHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Task;

import java.awt.event.ActionEvent;

public class AllTasksController
{
  @FXML private TableView<Task> tableView;
  @FXML private TableColumn<String, Task> creatorColumn;
  @FXML private TableColumn<String, Task> descriptionColumn;
  @FXML private TableColumn<String, Task> dateColumn;

  private AllTasksViewModel allTasksViewModel;
  private ViewHandler viewHandler;

  public void init(AllTasksViewModel allTasksViewModel, ViewHandler viewHandler)
  {
    this.allTasksViewModel = allTasksViewModel;
    this.viewHandler = viewHandler;
  }

  public void onAddButton(ActionEvent evt) {

  }

  public void onNextTaskButton(ActionEvent evt) {

  }
}
