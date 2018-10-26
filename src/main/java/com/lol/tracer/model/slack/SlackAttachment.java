package com.lol.tracer.model.slack;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SlackAttachment {
    @JsonProperty("image_url")
    String imageUrl;
}
