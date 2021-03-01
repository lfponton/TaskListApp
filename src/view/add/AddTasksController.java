package view.add;

import core.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddTasksController
{
  @FXML private TextField ownerTextField;
  @FXML private TextField descriptionTextField;

  private AddTasksViewModel addTasksViewModel;
  private ViewHandler  viewHandler;

  public void init(AddTasksViewModel addTasksViewModel, ViewHandler viewHandler)
  {
    this.addTasksViewModel = addTasksViewModel;
    this.viewHandler = viewHandler;

    ownerTextField.textProperty().bindBidirectional(addTasksViewModel.ownerProperty());
    descriptionTextField.textProperty().bindBidirectional(addTasksViewModel.descriptionProperty());
  }

  public void onAddButton(ActionEvent actionEvent) {
    addTasksViewModel.addNewTask();
    addTasksViewModel.clear();
  }

  public void onBackAction(ActionEvent actionEvent) {
    addTasksViewModel.clear();
    viewHandler.openAllTasksView();
  }
}
