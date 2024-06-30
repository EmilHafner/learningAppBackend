package com.emil_hafner.app.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.openai.OpenAiEmbeddingModel;
import org.springframework.ai.openai.OpenAiImageModel;
import org.springframework.ai.openai.api.OpenAiImageApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.openai.api.OpenAiApi;

@Configuration
@Slf4j
public class OpenAiConfig {

    @Bean
    public OpenAiChatModel openAiChatClient(OpenAiApi openAiApi) {
        return new OpenAiChatModel(openAiApi);
    }

    @Bean
    public OpenAiApi openAiApi(@Value("${OPENAI_API_URL}") String url, @Value("${OPENAI_API_KEY}") String secret) {
        return new OpenAiApi(url, secret);
    }

}
