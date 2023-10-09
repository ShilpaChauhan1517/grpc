package com.service.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class FeatureCalculator {

    // Method to calculate total number of feature dynamically based on feature name
    public static int calculateFeatureValue(JsonObject json, String featureName) {
        switch (featureName) {
            case "F1":
                return calculateTotalNumberOfLoans(json);
            case "F2":
                return calculateTotalNumberOfOpenLoans(json);
            case "F3":
                return calculateTotalNumberOfClosedLoans(json);
            case "F4":
                return calculateTotalOutstandingAmountOfAllTrades(json);
            case "F5":
                return calculateTotalNoOfTradesOpenedSinceXMonths(json);
            case "F6":
                return calculateAverageMonthlyInstallmentsSinceXMonths(json);
            default:
                return 0;
        }
    }

    private static int calculateAverageMonthlyInstallmentsSinceXMonths(JsonObject json) {
        return 0;
    }

    private static int calculateTotalNoOfTradesOpenedSinceXMonths(JsonObject json) {
        return 0;
    }

    public static int calculateTotalOutstandingAmountOfAllTrades(JsonObject json) {
        JsonArray loans = json.getAsJsonArray("loans_");
        int totalOutstandingAmount = 0;

        // Iterate through loans and calculate outstanding amounts for all loans
        for (JsonElement loanElement : loans) {
            JsonObject loan = loanElement.getAsJsonObject();
            int sanctionedAmount = Integer.parseInt(loan.get("sanctionedAmount_").getAsString());

            // Calculate total previous payments made on this loan
            int totalPreviousPayments = 0;
            JsonArray previousInstallments = loan.getAsJsonArray("previousInstallments_");
            for (JsonElement installmentElement : previousInstallments) {
                JsonObject installment = installmentElement.getAsJsonObject();
                int amountPaid = installment.get("amountPaid_").getAsInt();
                totalPreviousPayments += amountPaid;
            }

            // Calculate outstanding amount for this loan
            int outstandingAmount = sanctionedAmount - totalPreviousPayments;

            // Add the outstanding amount to the total
            totalOutstandingAmount += outstandingAmount;
        }

        return totalOutstandingAmount;
    }

    public static int calculateTotalNumberOfLoans(JsonObject json) {
        JsonArray loans = json.getAsJsonArray("loans_");
        return loans.size();
    }

    public static int calculateTotalNumberOfOpenLoans(JsonObject json) {
        JsonArray loans = json.getAsJsonArray("loans_");
        int openLoansCount = 0;
        for (JsonElement loanElement : loans) {
            JsonObject loan = loanElement.getAsJsonObject();
            String loanStatus = loan.get("loanStatus_").getAsString();
            if ("open".equalsIgnoreCase(loanStatus)) {
                openLoansCount++;
            }
        }
        return openLoansCount;
    }

    public static int calculateTotalNumberOfClosedLoans(JsonObject json) {
        JsonArray loans = json.getAsJsonArray("loans_");
        int closedLoansCount = 0;
        for (JsonElement loanElement : loans) {
            JsonObject loan = loanElement.getAsJsonObject();
            String loanStatus = loan.get("loanStatus_").getAsString();
            if ("closed".equalsIgnoreCase(loanStatus)) {
                closedLoansCount++;
            }
        }
        return closedLoansCount;
    }
}
