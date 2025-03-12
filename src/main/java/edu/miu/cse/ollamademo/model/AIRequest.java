package edu.miu.cse.ollamademo.model;

public record AIRequest(
        String model,
        String prompt
) {
}