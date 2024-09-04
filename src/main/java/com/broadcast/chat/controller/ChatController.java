package com.broadcast.chat.controller;

import com.broadcast.chat.dto.ChatResponseDto;
import com.broadcast.chat.dto.MessageCreateDto;
import com.broadcast.chat.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController(value = "/chat")
public class ChatController {

    private final ChatService chatService;

    @PostMapping("/{id}/latest")
    public Page<ChatResponseDto> getLastChats(@PathVariable(name = "id") Long id, Pageable pageable) {
        return chatService.findPage(id, pageable);
    }

    @DeleteMapping("/{id}")
    public Long deleteChat(@PathVariable(name = "id") Long id) {
        return chatService.delete(id);
    }

    @PostMapping("/create/{id}")
    public ChatResponseDto createChat(@PathVariable(name = "id") Long creatorId) {
        return chatService.create(creatorId);
    }

    @PostMapping("/account/{id}")
    public ChatResponseDto addAccount(@PathVariable(name = "id") Long accountId) {
        return chatService.addAccount(accountId);
    }

    @DeleteMapping("/account/{id}")
    public Long removeAccount(@PathVariable(name = "id") Long accountId) {
        return chatService.removeAccount(accountId);
    }

    @MessageMapping
    public void processMessages(MessageCreateDto createDto) {
        chatService.processMessage(createDto);
    }

}
