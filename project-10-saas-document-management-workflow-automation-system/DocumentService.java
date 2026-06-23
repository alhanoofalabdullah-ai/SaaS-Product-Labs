package src.services;

import src.models.Document;

import java.util.ArrayList;
import java.util.List;

public class DocumentService {

    private List<Document> documents =
            new ArrayList<>();

    private int nextId = 1;

    public void createDocument(
            String title,
            String owner) {

        documents.add(
                new Document(
                        nextId++,
                        title,
                        owner));
    }

    public Document findDocument(
            int id) {

        for (Document document : documents) {

            if (document.getId() == id) {

                return document;
            }
        }

        return null;
    }

    public int totalDocuments() {
        return documents.size();
    }

    public List<Document> getDocuments() {
        return documents;
    }
}
