package com.voting.votingapp.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class OptionVote {
    private String optionText;
    @Getter
    private Long voteCount = 0L;
}
