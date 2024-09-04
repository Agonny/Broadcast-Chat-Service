package com.broadcast.chat.service;

import com.broadcast.chat.dto.ChatResponseDto;
import com.broadcast.chat.dto.MessageCreateDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ChatService {

    Page<ChatResponseDto> findPage(Long id, Pageable pageable);

    Long delete(Long chatId);

    ChatResponseDto create(Long creatorId);

    ChatResponseDto addAccount(Long accountId);

    Long removeAccount(Long accountId);

    void processMessage(MessageCreateDto createDto);

}
