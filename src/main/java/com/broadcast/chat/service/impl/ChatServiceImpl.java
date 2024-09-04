package com.broadcast.chat.service.impl;

import com.broadcast.chat.dto.ChatResponseDto;
import com.broadcast.chat.dto.MessageCreateDto;
import com.broadcast.chat.service.ChatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {



    @Override
    public Page<ChatResponseDto> findPage(Long id, Pageable pageable) {
        return null;
    }

    @Override
    public Long delete(Long chatId) {
        return null;
    }

    @Override
    public ChatResponseDto create(Long creatorId) {
        return null;
    }

    @Override
    public ChatResponseDto addAccount(Long accountId) {
        return null;
    }

    @Override
    public Long removeAccount(Long accountId) {
        return null;
    }

    @Override
    public void processMessage(MessageCreateDto createDto) {

    }

}
