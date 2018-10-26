package com.lol.tracer.model.slack;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class SlackNotification {
    String text;

    String userName;

    List<SlackAttachment> attachments = new ArrayList<>();
}
