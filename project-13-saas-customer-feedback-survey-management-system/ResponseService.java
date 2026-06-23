package src.services;

import src.models.Response;
import java.util.*;

public class ResponseService {

    private List<Response> responses = new ArrayList<>();

    public void submitResponse(
            String customer,
            String survey,
            int rating) {

        responses.add(
                new Response(
                        customer,
                        survey,
                        rating));
    }

    public List<Response> getResponses() {
        return responses;
    }

    public int totalResponses() {
        return responses.size();
    }
}
