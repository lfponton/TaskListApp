package model;

import util.PropertyChangeSubject;

public interface TaskModel extends PropertyChangeSubject
{
  void addTask(String owner, String description);
  Task getNextTask();
}
