package view.remove;

import core.ViewHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Task;

import javafx.event.ActionEvent;

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

    creatorColumn.setCellValueFactory(new PropertyValueFactory<>("owner"));
    descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
    dateColumn.setCellValueFactory(new PropertyValueFactory<>("timeCreated"));
    tableView.setItems(allTasksViewModel.getTasks());
  }

  public void onAddButton(ActionEvent actionEvent) {
    viewHandler.openAddTaskView();
  }

  public void onNextTaskButton(ActionEvent actionEvent) {
    viewHandler.openNextTaskView();
  }

  
}
