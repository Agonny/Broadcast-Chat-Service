package com.broadcast.chat.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatResponseDto {

    private Long id;

    private Set<ChatUserResponseDto> groupUsers;

    private MessageResponseDto lastMessage;

}
