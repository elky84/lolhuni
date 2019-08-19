package com.lol.tracer.model.slack;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@Accessors(chain = true)
public class SlackNotification {
    String text;

    String userName;

    @JsonProperty("icon_url")
    String iconUrl;

    String channel;

    List<SlackAttachment> attachments = new ArrayList<>();
}
