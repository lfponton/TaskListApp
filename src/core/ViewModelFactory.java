package core;

import view.remove.AllTasksViewModel;

public class ViewModelFactory
{
  private ModelFactory modelFactory;
  private AllTasksViewModel allTasksViewModel;

  public ViewModelFactory(ModelFactory modelFactory) {
    this.modelFactory = modelFactory;
  }

  public AllTasksViewModel getAllTasksViewModel() {
    if (allTasksViewModel == null) {
      this.allTasksViewModel = new AllTasksViewModel(modelFactory.getTaskModel());
    }
    return allTasksViewModel;
  }
}
