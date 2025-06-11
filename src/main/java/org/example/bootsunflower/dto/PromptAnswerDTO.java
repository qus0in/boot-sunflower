package org.example.bootsunflower.dto;

import java.time.ZonedDateTime;

public record PromptAnswerDTO(
        String url,
        String question,
        String answer,
        String createdAt
) {
}
