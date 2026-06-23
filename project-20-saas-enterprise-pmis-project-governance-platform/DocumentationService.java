package src.services;

import src.models.ProjectDocument;
import java.util.*;

public class DocumentationService {

    private List<ProjectDocument> documents =
            new ArrayList<>();

    public void registerDocument(
            String title) {

        documents.add(
                new ProjectDocument(
                        title));
    }

    public int totalDocuments() {
        return documents.size();
    }
}
