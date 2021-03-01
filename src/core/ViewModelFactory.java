package core;

import view.add.AddTasksViewModel;
import view.remove.AllTasksViewModel;

public class ViewModelFactory
{
  private ModelFactory modelFactory;
  private AllTasksViewModel allTasksViewModel;
  private AddTasksViewModel addTasksViewModel;

  public ViewModelFactory(ModelFactory modelFactory) {
    this.modelFactory = modelFactory;
  }

  public AllTasksViewModel getAllTasksViewModel() {
    if (allTasksViewModel == null) {
      this.allTasksViewModel = new AllTasksViewModel(modelFactory.getTaskModel());
    }
    return allTasksViewModel;
  }

  public AddTasksViewModel getAddTasksViewModel() {
    if (addTasksViewModel == null) {
      this.addTasksViewModel = new AddTasksViewModel(modelFactory.getTaskModel());
    }
    return addTasksViewModel;
  }
}
