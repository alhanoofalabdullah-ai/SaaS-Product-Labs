package src.services;

import src.models.Response;

public class AnalyticsService {

    private ResponseService responseService;

    public AnalyticsService(
            ResponseService responseService) {

        this.responseService = responseService;
    }

    public double averageRating() {

        double total = 0;

        for (Response response :
                responseService.getResponses()) {

            total += response.getRating();
        }

        if (responseService.totalResponses() == 0) {
            return 0;
        }

        return total /
                responseService.totalResponses();
    }
}
