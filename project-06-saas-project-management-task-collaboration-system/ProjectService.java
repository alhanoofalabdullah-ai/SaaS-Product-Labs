package src.services;

import src.models.Project;

import java.util.ArrayList;
import java.util.List;

public class ProjectService {

    private List<Project> projects = new ArrayList<>();
    private int nextId = 1;

    public void createProject(String name, String description) {

        projects.add(new Project(nextId++, name, description));
    }

    public List<Project> getProjects() {
        return projects;
    }

    public int totalProjects() {
        return projects.size();
    }
}
